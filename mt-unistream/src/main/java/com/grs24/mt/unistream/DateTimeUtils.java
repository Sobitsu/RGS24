package com.grs24.mt.unistream;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 *
 * @author CtaC, Sergey Kozlov
 */
public class DateTimeUtils
{
	public static final String SERVER_DATE_FORMAT = "yyyy-MM-dd";
	public static final String SERVER_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String SERVER_TIME_FORMAT = "H:mm:ss";
	public static final String SHORT_TIME_FORMAT_STRING = "H:mm";
	public static final String VIEW_DATE_FORMAT_STRING = "d.MM.yyyy";
	public static final String VIEW_DATESHORT_FORMAT_STRING = "dd.MM";
	public static final String VIEW_DATETIME_FORMAT_STRING = "d.MM.yyyy H:mm:ss";
	public static final String VIEW_DATESHORTTIME_FORMAT_STRING = "d.MM.yyyy H:mm";
	public static final String ORACLE_DATETIME_FORMAT_STRING = "dd.MM.yyyy HH:mm:ss";
	public static final String ORACLE_DATE_FORMAT_STRING = "dd.MM.yyyy";
	public static final String NSPCMAIL_DATE_FORMAT_STRING = "yyyyMMdd";

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(SERVER_DATE_FORMAT);
	private static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat(SERVER_DATETIME_FORMAT);
	private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat(SERVER_TIME_FORMAT);
	private static final SimpleDateFormat SHORT_TIME_FORMAT = new SimpleDateFormat(SHORT_TIME_FORMAT_STRING);
	private static final SimpleDateFormat VIEW_DATE_FORMAT = new SimpleDateFormat(VIEW_DATE_FORMAT_STRING);
	private static final SimpleDateFormat VIEW_DATETIME_FORMAT = new SimpleDateFormat(VIEW_DATETIME_FORMAT_STRING);
	private static final SimpleDateFormat ORACLE_DATETIME_FORMAT = new SimpleDateFormat(ORACLE_DATETIME_FORMAT_STRING);
	private static final SimpleDateFormat ORACLE_DATE_FORMAT = new SimpleDateFormat(ORACLE_DATE_FORMAT_STRING);
	private static final SimpleDateFormat VIEW_DATESHORTTIME_FORMAT = new SimpleDateFormat(VIEW_DATESHORTTIME_FORMAT_STRING);
	private static final SimpleDateFormat NSPCMAIL_DATE_FORMAT = new SimpleDateFormat(NSPCMAIL_DATE_FORMAT_STRING);

	private static final String[] DAYS_OF_WEEK_NAMES = new String[]{"Пнд", "Вт", "Ср", "Чет", "Птн", "Сб", "Вс"};
	
	private static final Locale LOCALE = new Locale("ru");
	
	public static Date parseDate(String dateString, String dateFormat)
	{
		if(dateString == null || dateFormat == null)
			return null;

		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		return parseDate(dateString, format);
	}

	public static Date parseDate(String dateString, DateFormat dateFormat)
	{		
		if(dateString == null)
			return null;
		if(dateString.isEmpty())
			return null;
		
		if(dateFormat == null)
			return null;

		try
		{
			return dateFormat.parse(dateString);
		}
		catch(Exception e)
		{
			//Logger LOG = LoggerFactory.getLogger(DateTimeUtils.class);
			//LOG.warn("Cannot parse date[{}] by pattern[{}]. Reason: {}",
			//		new Object[]{dateString, dateFormat, e.getMessage()});

			return null;
		}
	}
	
	public static Date parseDate(String dateString, DateFormat[] dateFormatChain)
	{
		if(dateString == null)
			return null;
		if(dateString.isEmpty())
			return null;
		
		if(dateFormatChain == null)
			return null;
		if(dateFormatChain.length == 0)
			return null;
		if(dateFormatChain.length == 1)
			return parseDate(dateString, dateFormatChain[0]);

		Date out = null;
		Exception e = null;
		for(DateFormat dateFormat : dateFormatChain)
		{
			try
			{
				out = dateFormat.parse(dateString);
				if(out != null)
					return out;
			}
			catch(Exception ex)
			{
				e = ex;
				continue;
			}
		}
	
		//if(e != null)
		//	LoggerFactory.getLogger(DateTimeUtils.class).warn(
		//			"Cannot parse date[{}] by patterns[{}]. Reason[{}]: {}",
		//			new Object[]{dateString, Arrays.toString(dateFormatChain), e.getClass(), e.getMessage()});

		return out;
	}

	public static Date parseDate(String dateString)
	{
		return parseDate(dateString, new DateFormat[]{DATE_FORMAT, VIEW_DATE_FORMAT});
	}

	public static Date parseDateTime(String dateString)
	{
		return parseDate(dateString, new DateFormat[]{DATE_TIME_FORMAT, VIEW_DATETIME_FORMAT, VIEW_DATESHORTTIME_FORMAT, ORACLE_DATETIME_FORMAT});
	}

	public static Integer parseTimeHours(String timeString)
	{
		Date time = parseTime(timeString);
		if(time == null)
			return null;
		
		Calendar date = Calendar.getInstance();
		date.setTime(time);
		
		return date.get(Calendar.HOUR_OF_DAY);
	}
	
	public static Date parseTime(String dateString)
	{
		return parseDate(dateString, new DateFormat[]{TIME_FORMAT, SHORT_TIME_FORMAT});
	}
	
	public static String formatDate(Date date, DateFormat dateFormat)
	{
		if(date == null || dateFormat == null)
			return null;

		return dateFormat.format(date);
	}
	
	public static String formatDate(Date date, String dateFormat)
	{
		if(date == null || dateFormat == null)
			return null;

		DateFormat format = new SimpleDateFormat(dateFormat, LOCALE);
		return format.format(date);
	}
	
	public static String formatDateUTC(Date date, String dateFormat)
	{
		if(date == null || dateFormat == null)
			return null;

		DateFormat format = new SimpleDateFormat(dateFormat);
		format.setTimeZone(TimeZone.getTimeZone("GMT"));
		return format.format(date);
	}
	
	public static String formatDateRussian(Date date)
	{
		if(date == null)
			return "";

		DateFormat format = new SimpleDateFormat("dd MMMM yyyy", russianDateFormatSymbols);
		return format.format(date);
	}

	public static String formatDate(Date date)
	{
		return formatDate(date, DATE_FORMAT);
	}

	public static String formatDateToView(Date date)
	{
		return formatDate(date, VIEW_DATE_FORMAT);
	}

	public static String formatTime(Date date)
	{
		return formatDate(date, TIME_FORMAT);
	}
	
	public static String formatShortTime(Date date)
	{
		return formatDate(date, SHORT_TIME_FORMAT);
	}

	public static String formatDateTime(Date date)
	{
		return formatDate(date, DATE_TIME_FORMAT);
	}
	
	public static String formatDateTimeToOracle(Date date)
	{
		return formatDate(date, ORACLE_DATETIME_FORMAT);
	}

	public static String formatDateToOracle(Date date)
	{
		return formatDate(date, ORACLE_DATE_FORMAT);
	}
	
	public static String formatDateTimeToView(Date date)
	{
		return formatDate(date, VIEW_DATETIME_FORMAT);
	}
	
	public static String formatDateTimeShortToView(Date date)
	{
		return formatDate(date, VIEW_DATESHORTTIME_FORMAT);
	}

	public static Date offsetDate(Date d, int field, int interval)
	{
		if(d == null)
			return null;

		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(field, interval);

		return c.getTime();
	}
	
	public static Date updateDate(Date d, int field, int value)
	{
		if(d == null)
			return null;

		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.set(field, value);

		return c.getTime();
	}
	
	public static boolean isDateString(String dateString)
	{
		return isDateString(dateString, new DateFormat[]{DATE_FORMAT, VIEW_DATE_FORMAT});
	}
	
	public static boolean isTimeString(String timeString)
	{
		return isDateString(timeString, new DateFormat[]{TIME_FORMAT, SHORT_TIME_FORMAT});
	}
	
	public static boolean isDateString(String dateString, DateFormat[] dateFormatChain)
	{
		if(dateString == null || dateFormatChain == null)
			return false;
		if(dateFormatChain.length == 0)
			return false;
/*		if(dateFormatChain == null)
			return false;  дублирование кода*/
		if(dateFormatChain.length == 0)
			return false;

		for(DateFormat dateFormat : dateFormatChain)
		{
			try
			{
				dateFormat.parse(dateString);
			}
			catch(ParseException ex)
			{
				continue;
			}
			
			return true;
		}
		
		return false;
	}
	
	public static Integer getDayOfWeek(Date date)
	{
		if(date == null)
			return null;
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		// -1, т.к. на западе отчет недели начинается с воскресенья
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		if(dayOfWeek == 0)
			dayOfWeek = 7;
		
		return dayOfWeek;
	}
	
	public static String getDayOfWeekName(Integer dayOfWeek)
	{
		if(dayOfWeek == null)
			return "";
		
		int dayIndex = dayOfWeek.intValue() - 1;
		
		if(dayIndex >= DAYS_OF_WEEK_NAMES.length || dayIndex < 0)
			return "";
		
		return DAYS_OF_WEEK_NAMES[dayIndex];
	}

	public static Date getDateWithoutMilliseconds(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	private static DateFormatSymbols russianDateFormatSymbols = new DateFormatSymbols(){

        @Override
        public String[] getMonths() {
            return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        }
    };
	
	public static String formatDurationTime(int duration)
	{
		int minutes = duration % 60;
		int hours = duration / 60;
		int days = hours / 24;
		hours %= 24;
		
		return (days < 10 ? "0" : "") + days + ":" + (hours < 10 ? "0" : "") + hours + ":" + (minutes < 10 ? "0" : "") + minutes;
	}
	
	public static String formatDurationTimeWithChars(int duration)
	{
		int minutes = duration % 60;
		int hours = duration / 60;
		int days = hours / 24;
		hours %= 24;
		
		return (days < 10 ? "0" : "") + days + " д " + (hours < 10 ? "0" : "") + hours + " ч " + (minutes < 10 ? "0" : "") + minutes + " м";
	}
	
	/**
	 * для сравнения дат в формате dd.mm.yyyy
	 * 
	 * @return 0 - если даты совпадают,
	 *	0+ - если date1 > date2,
	 *  -0 - если date1 < date2
	 */
	public static int compareTo(Date date1, Date date2) {
		if(formatDate(date2).equalsIgnoreCase(formatDate(date1)))
			return 0;
		
		return date1.compareTo(date2);
	}
}
