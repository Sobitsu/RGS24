package com.grs24.mt.unistream.wsclient;
import com.sun.xml.ws.client.BindingProviderProperties;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import javax.xml.ws.BindingProvider;
/**
 *
 * @author Dale
 */
public class WebServiceSingl {
    private static volatile WebServiceSingl instance;
    public volatile IWebService service = null;
    private final Properties properties;
    private final String PROPERTY_FILE_PATH = "config.properties";
    private final String PROPERTY_KEY_SERVER_REQUEST_TUMEOUT = "SERVER.REQUEST_TIMEOUT";
    private final String PROPERTY_KEY_SERVER_CONNECT_TUMEOUT = "SERVER.CONNECT_TIMEOUT";
    private final Integer DEFAULT_REQUEST_TIMEOUT = 3000;
    private final Integer DEFAULT_CONNECT_TIMEOUT = 1000;
    
    WebServiceSingl() throws UnsupportedOperationException, IOException {
        properties = new Properties();
        loadProperties();
        String val = properties.getProperty(PROPERTY_KEY_SERVER_REQUEST_TUMEOUT, String.valueOf(PROPERTY_KEY_SERVER_REQUEST_TUMEOUT));
        Integer  request_timeout;
        try{
                request_timeout = Integer.parseInt(val);
            }
	catch(NumberFormatException e)
	    {
                request_timeout = DEFAULT_REQUEST_TIMEOUT;
	    }

        val = properties.getProperty(PROPERTY_KEY_SERVER_CONNECT_TUMEOUT, String.valueOf(PROPERTY_KEY_SERVER_CONNECT_TUMEOUT));
        Integer  connect_timeout;
        try{
                connect_timeout = Integer.parseInt(val);
            }
	catch(NumberFormatException e)
	    {
                connect_timeout = DEFAULT_CONNECT_TIMEOUT;
	    }
        service = new WebService().getWS2007HttpBindingIWebService();
        Map<String, Object> requestContext = ((BindingProvider)service).getRequestContext();
        requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, request_timeout); // Timeout in millis
        requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, connect_timeout); // Timeout in millis
    }
    
    public static WebServiceSingl getInstance() throws UnsupportedOperationException, IOException {
		WebServiceSingl localInstance = instance;
		if (localInstance == null) {
			synchronized (WebServiceSingl.class) {
				localInstance = instance;
				if (localInstance == null) {
					instance = localInstance = new WebServiceSingl();
				}
			}
		}
		return localInstance;
	}
    private void loadProperties() throws UnsupportedOperationException, IOException
    {
            File propFile = getPopertyFile();
        try (FileInputStream fis = new FileInputStream(propFile)) {
            properties.load(fis);
        }
    }

    private File getPopertyFile() throws UnsupportedOperationException
    {
            String propertyFilePath = PROPERTY_FILE_PATH;
            File propFile = new File(propertyFilePath);
            if(!propFile.exists())
            {
                    propertyFilePath = propertyFilePath.replaceAll("\\\\", "/");
                    propFile = new File(propertyFilePath);
            }

            if(!propFile.exists())
                    throw new UnsupportedOperationException("No Property file [" + propFile.getAbsolutePath() + "]");

            return propFile;
    }
}