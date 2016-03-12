/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ui.ModelMap;
/**
 *
 * @author v.rezin
 */
public class MtUniAdapterLoadtest {

	private final ApplicationContext ctx;
	private final MtUnistreamAdapter mtAdapter;

	private MtUniAdapterLoadtest(ApplicationContext ctx)
	{
		this.ctx = ctx;
		mtAdapter = ctx.getBean(MtUnistreamAdapter.class);
	}

	public static void main(String[] args) throws Exception
	{
		ApplicationContext ctx = new FileSystemXmlApplicationContext(new String[]{"webapp/WEB-INF/loadingTestsContext.xml"});
		MtUniAdapterLoadtest test = new MtUniAdapterLoadtest(ctx);
		test.testParallel(10, 10);
	}

	public void testParallel(int threadCount, int tryCount)
	{
		List<Callable<Long>> tasks = new ArrayList<>(tryCount);
		for (int i = 0; i < tryCount; i++) {
			tasks.add(new LoadTask("/test/test.odt", createModel()));
		}

		long[] times = new long[tryCount];
		int t = 0;
		SimpleThreadFactory tFactory = new SimpleThreadFactory();
		ExecutorService executorService = Executors.newFixedThreadPool(threadCount, tFactory);
		try {
			List<Future<Long>> results = executorService.invokeAll(tasks);
			for (Future<Long> result : results) {
				times[t] = result.get();
				t++;
			}

			System.out.println("TEST PARALLEL");
			handleTimesResult(times);

		} catch (InterruptedException | ExecutionException e) {
			LoadTask task = (LoadTask) tasks.get(t);
			System.err.println("Exception[" + e.getClass() + "]: " + task.getTemplateName() + "; message: " + e.getMessage());
			//e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
	}

	private void handleTimesResult(long[] times)
	{
		int tryCount = times.length;
		long min = Long.MAX_VALUE;
		long max = 0L;
		long sum = 0L;

		for (int t = 0; t < tryCount; t++) {
			if (min > times[t])
				min = times[t];
			if (max < times[t])
				max = times[t];

			sum += times[t];
		}

		long middle = sum / tryCount;

		System.out.println("Min: " + min + "ms.");
		System.out.println("Max: " + max + "ms.");
		System.out.println("Total: " + sum + "ms.");
		System.out.println("Middle: " + middle + "ms.");

		long totalSec = sum / 1000;
		if (totalSec == 0)
			totalSec = 1;

		double requestPerSecond = tryCount / totalSec;
		System.out.println("Per second: " + requestPerSecond + ".");
	}

	private ModelMap createModel()
	{
		ModelMap map = new ModelMap();
		map.put("text", "Привет мир! Hello world! 你好世界 !");
		map.put("showText", Boolean.TRUE);
		map.put("img_stamp", "act/stamp.jpg");
		List<Map<String, Object>> list = new ArrayList<>();
		int countRows = 10;
		for (int i = 0; i < countRows; i++) {
			Map<String, Object> row = new LinkedHashMap<>();
			int line = i + 1;
			row.put("line", line);
			row.put("name", "Позиция" + line);
			row.put("sum", line + ".00");
			list.add(row);
		}
		map.put("rs", list);
		return map;
	}

	class LoadTask implements Callable<Long>
	{

		private final String templateName;
		private final ModelMap modelMap;

		public LoadTask(String templateName, ModelMap modelMap)
		{
			this.templateName = templateName;
			this.modelMap = modelMap;
		}

		@Override
		public Long call() throws Exception
		{
			long start = System.currentTimeMillis();
			String tName = Thread.currentThread().getName();
			try {
			//	FileManager fileManager = new FileManager(reportCreater.getTmpDir());
				String fileName = "";// FileUtils.generateTmpFileName(templateName, FileFormat.pdf, System.currentTimeMillis());
			//	File outFile = fileManager.getFile(fileName);
			//	reportCreater.generatePdf("/test/test.odt", modelMap, PdfConverterTypeVia.XDOC, outFile);
				System.out.println("Generated new pdf: " + fileName);

			} catch (Throwable e) {
				System.err.println("Exception[" + e.getClass() + "]: " + tName + "; message: " + e.getMessage());
				//e.printStackTrace();
				throw e;
			}

			return System.currentTimeMillis() - start;
		}

		public String getTemplateName()
		{
			return templateName;
		}

		public ModelMap getModelMap()
		{
			return modelMap;
		}
	}

	class SimpleThreadFactory implements ThreadFactory
	{

		private int count = 1;

		@Override
		public Thread newThread(Runnable r)
		{
			return new Thread(r, generateName());
		}

		private String generateName()
		{
			return "t_" + count++;
		}
	}
}
