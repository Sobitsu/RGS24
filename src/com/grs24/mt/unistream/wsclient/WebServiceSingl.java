package com.grs24.mt.unistream.wsclient;
import com.grs24.mt.unistream.MtUnistreamAdapter;
import com.sun.xml.ws.client.BindingProviderProperties;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.IOException;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Dale
 * Класс singletone для текущего экземпляра WebService
 */
public class WebServiceSingl {
    private static volatile WebServiceSingl instance;
    public volatile IWebService service = null;
    private static final Logger logger = LoggerFactory.getLogger(WebServiceSingl.class);
/**
 * Конструктор. Так как открытие канала с UniStream достаточно долгая операция то заменил постоянное 
 * открытие закрытие на единовременное поднятие при инициализации класса
 * при этом происходит настройка WebService и установка его таймингов.
 * @throws UnsupportedOperationException
 * @throws IOException 
 * @see MtUnistreamAdapter#KEY_SERVER_REQUEST_TUMEOUT
 * @see MtUnistreamAdapter#KEY_SERVER_CONNECT_TUMEOUT
 */
    
    WebServiceSingl() throws UnsupportedOperationException, IOException {
        if (logger.isDebugEnabled()) {
            logger.debug("WebServiceSingl <- Constructor start");
            }  
        Integer request_timeout = MtUnistreamAdapter.KEY_SERVER_REQUEST_TUMEOUT;
        Integer connect_timeout = MtUnistreamAdapter.KEY_SERVER_CONNECT_TUMEOUT;
        service = new WebService().getWS2007HttpBindingIWebService();
        Map<String, Object> requestContext = ((BindingProvider)service).getRequestContext();
        requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, request_timeout); // Timeout in millis
        requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, connect_timeout); // Timeout in millis
        if (logger.isDebugEnabled()) {
            logger.debug("WebServiceSingl -> Constructor finish");
            }  
    }
    
    /**
     * Инициализация синглтона
     * @return Экземпляр инициализированного WebService провайдера
     * @throws UnsupportedOperationException 
     * @throws IOException - в случае разрыва связи с сервером
     */
    
    public static WebServiceSingl getInstance() throws UnsupportedOperationException, IOException {
        if (logger.isDebugEnabled()) {
            logger.debug("getInstance <- Start");
            }  
        WebServiceSingl localInstance = instance;
            if (localInstance == null) {
                    synchronized (WebServiceSingl.class) {
                            localInstance = instance;
                            if (localInstance == null) {
                                    instance = localInstance = new WebServiceSingl();
                            }
                    }
            }
            if (logger.isDebugEnabled()) {
                logger.debug("getInstance -> localInstance = "+localInstance.toString());
            }  
            return localInstance;
	}
}