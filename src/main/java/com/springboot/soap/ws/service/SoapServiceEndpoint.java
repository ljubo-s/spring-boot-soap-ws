package com.springboot.soap.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.springboot.soap.ws.service.internal.FirstRequest;
import com.springboot.soap.ws.service.internal.FirstResponse;
import com.springboot.soap.ws.service.internal.PersonObjectService;
import com.springboot.soap.ws.service.internal.SecondRequest;
import com.springboot.soap.ws.service.internal.SecondResponse;
import com.springboot.soap.ws.service.internal.ThirdRequest;
import com.springboot.soap.ws.service.internal.ThirdResponse;
import static com.springboot.soap.ws.service.SoapServiceFault.*;

/**
 * 
 * @author Ljubomir Stijepovic
 *
 */

@Endpoint
public class SoapServiceEndpoint {

    private static final String SOAP_WS_NAMESPACE_URI = "http://schemas.soapws.com/test/ws/soapws";

    private SoapService service;
    private SoapServiceLogger loger;
    
    @Autowired
    public SoapServiceEndpoint(SoapServiceLogger loger, SoapService service) {
        this.loger = loger;
        this.service = service;
    }
    
    @PayloadRoot(localPart = "firstRequest", namespace = SOAP_WS_NAMESPACE_URI)
    @ResponsePayload
    public FirstResponse handleFirstRequest(@RequestPayload FirstRequest request) throws Exception {

        FirstResponse response = new FirstResponse();
        PersonObjectService person = new PersonObjectService();

        try {
            System.out.println(" first endpoint 1");

            person.setName(request.getName());
            person.setLastname(request.getLastname());
            person.setEmail(request.getEmail());
            person.setStatus(Integer.parseInt(request.getStatus()));

//            String result = service.firstRequest(person);

            String result = "";
            
            System.out.println(" first endpoint 3");
            response.setSuccess(true);
//            response.setId(person.getId().toString());
            response.setMessage(result);
/**
 * testiranje fault i request
 */
            System.out.println(" first endpoint 3.1");
            loger.logResponse("firstRequest", request, response);
            System.out.println(" first endpoint 4");
            return response;
        } catch (RuntimeException re) {
            System.out.println(" first endpoint 5 error");
            SoapServiceException fault = new SoapServiceException(CANNOT_REQUEST_TO_PDF);
            loger.logFault("firstRequest", request, fault, re);
            throw fault;
//            response.setSuccess(false);
//            return response;
        }
    }


    @PayloadRoot(localPart = "secondRequest", namespace = SOAP_WS_NAMESPACE_URI)
    @ResponsePayload
    public SecondResponse handleSecondRequest(@RequestPayload SecondRequest request) throws Exception {

        SecondResponse response = new SecondResponse();
        PersonObjectService person = new PersonObjectService();

        try {
            String result = service.secondRequest(person);
            response.setSuccess(true);
            response.setEmail(person.getEmail());
            response.setMessage(result);
            return response;
        } catch (RuntimeException re) {
            response.setSuccess(false);
            return response;
        }
    }


    @PayloadRoot(localPart = "thirdRequest", namespace = SOAP_WS_NAMESPACE_URI)
    @ResponsePayload
    public ThirdResponse handleThirdRequest(@RequestPayload ThirdRequest request) throws Exception {

        ThirdResponse response = new ThirdResponse();
        PersonObjectService person = new PersonObjectService();

        try {
            String result = service.thirdRequest(person);
            response.setSuccess(true);
            response.setEmail(person.getEmail());
            response.setName(result);
            return response;
        } catch (RuntimeException re) {
            response.setSuccess(false);
            return response;
        }
    }

}
