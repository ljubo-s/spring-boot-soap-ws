package com.springboot.soap.ws.service;

import com.springboot.soap.ws.service.internal.FirstRequest;
import com.springboot.soap.ws.service.internal.FirstResponse;
import com.springboot.soap.ws.service.internal.SecondRequest;
import com.springboot.soap.ws.service.internal.SecondResponse;
import com.springboot.soap.ws.service.internal.ThirdRequest;
import com.springboot.soap.ws.service.internal.ThirdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.springboot.soap.ws.service.internal.PersonObjectService;

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

            person.setName(request.getName());
            person.setLastname(request.getLastname());
            person.setEmail(request.getEmail());
            person.setStatus(Integer.parseInt(request.getStatus()));

            String result = service.firstRequest(person);

            response.setSuccess(true);
            response.setMessage(result);

            loger.logResponse("handleFirstRequest", request, response);

            return response;
        } catch (RuntimeException runtimeException) {
//          response.setSuccess(false);
//          return response;
            SoapServiceException fault = new SoapServiceException(ERROR_ON_FIRST_REQUEST);
            loger.logFault("handleFirstRequest", request, fault, runtimeException);
            throw fault;
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
        } catch (RuntimeException runtimeException) {
            SoapServiceException fault = new SoapServiceException(ERROR_ON_FIRST_REQUEST);
            loger.logFault("handleSecondRequest", request, fault, runtimeException);
            throw fault;
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
        } catch (RuntimeException runtimeException) {
            SoapServiceException fault = new SoapServiceException(ERROR_ON_FIRST_REQUEST);
            loger.logFault("handleThirdRequest", request, fault, runtimeException);
            throw fault;
        }
    }

}
