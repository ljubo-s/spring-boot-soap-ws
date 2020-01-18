package com.springboot.soap.ws.service;

import java.util.Date;
import java.util.Arrays;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.springboot.soap.ws.repo.model.SoapFault;
import com.springboot.soap.ws.repo.model.SoapRequest;
import com.springboot.soap.ws.repo.repository.SoapFaultRepository;
import com.springboot.soap.ws.repo.service.SoapFaultService;
import com.springboot.soap.ws.repo.service.SoapRequestService;

@Component
public class SoapServiceLogger {

    public static final int REQ_MAX_LENGTH = 1000;
    public static final int TRACE_MAX_LENGTH = 3000;
    private Gson gson;

    @Autowired
    SoapFaultService soapFaultService;
    @Autowired
    SoapRequestService soapRequestService;
    
    @Autowired
    public SoapServiceLogger(SoapFaultRepository repository) {
        this.gson = new GsonBuilder().create();
    }

    public void logResponse(String funkcija, Object request, Object response) {
        System.out.println(" logResponse 1");
        Date inTime = new Date(System.currentTimeMillis());
        System.out.println(" logResponse 1.1");
        String reqJSON = gson.toJson(request);
        System.out.println(" logResponse 1.2");
        reqJSON = trim(reqJSON, REQ_MAX_LENGTH);
        System.out.println(" logResponse 1.3");
        String resJSON = gson.toJson(response);
        System.out.println(" logResponse 2");
        SoapRequest soapRequest = new SoapRequest();
        System.out.println(" logResponse 3");
        soapRequest.setFunction(funkcija);
        System.out.println(" logResponse 4");
        soapRequest.setRequestData(reqJSON);
        System.out.println(" logResponse 5");
        soapRequest.setResponseData(resJSON);
        System.out.println(" logResponse 6");
        soapRequest.setActivityDate(inTime);
        System.out.println(" logResponse 2");
        soapRequestService.saveOrUpdate(soapRequest);
    }

    public void logFault(String funkcija, Object request, SoapServiceException fault, Throwable re) {
        Date inTime = new Date(System.currentTimeMillis());
        String req = gson.toJson(request);
        req = trim(req, REQ_MAX_LENGTH);
        String trace = traceAsString(fault, re);
        trace = trim(trace, TRACE_MAX_LENGTH);

        SoapFault soapFaults = new SoapFault();

        soapFaults.setFaultCode(fault.getCode());
        soapFaults.setFaultMessage(fault.getMessage());
        soapFaults.setTraceData(trace);
        soapFaults.setLogDate(inTime);
        System.out.println(" logFault");
        soapFaultService.saveOrUpdate(soapFaults);
    }

    private String trim(String str, int maxLength) {
        if (str != null) {
            return str.substring(0, Math.min(str.length(), maxLength));
        }
        return "";
    }

    private String traceAsString(SoapServiceException fault, Throwable re) {
        String str = "Fault: " + fault.toString() + "\t\n";
        if (re != null) {
            str += "Exception: " + re.toString() + "\t\n";
            str += "StackTrace: " + Arrays.toString(re.getStackTrace());
        }
        return str;
    }

}
