package com.grs24.mt.unistream.wsclient;
import com.grs24.mt.unistream.MtUnistreamAdapter;
import com.sun.xml.ws.client.BindingProviderProperties;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.IOException;
import java.util.Map;
import javax.xml.ws.BindingProvider;
/**
 *
 * @author Dale
 */
public class WebServiceSingl {
    private static volatile WebServiceSingl instance;
    public volatile IWebService service = null;

    
    WebServiceSingl() throws UnsupportedOperationException, IOException {
        Integer request_timeout = MtUnistreamAdapter.KEY_SERVER_REQUEST_TUMEOUT;
        Integer connect_timeout = MtUnistreamAdapter.KEY_SERVER_CONNECT_TUMEOUT;
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
}