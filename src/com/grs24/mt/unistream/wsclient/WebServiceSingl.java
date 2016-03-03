package com.grs24.mt.unistream.wsclient;
import com.sun.xml.ws.client.BindingProviderProperties;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.util.Map;
import javax.xml.ws.BindingProvider;
/**
 *
 * @author Dale
 */
public class WebServiceSingl {
    private static volatile WebServiceSingl instance;
    public static volatile IWebService service = null;
    
    WebServiceSingl() {
        service = new WebService().getWS2007HttpBindingIWebService();
        Map<String, Object> requestContext = ((BindingProvider)service).getRequestContext();
        requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 3000); // Timeout in millis
        requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 1000); // Timeout in millis
    }
    public static WebServiceSingl getInstance() {
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
}