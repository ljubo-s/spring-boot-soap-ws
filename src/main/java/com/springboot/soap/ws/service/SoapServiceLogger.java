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

    public static final int REQUEST_MAX_LENGTH = 1000;
    public static final int RESPONSE_MAX_LENGTH = 1000;

    public static final int MESSAGE_MAX_LENGTH = 1000;
    public static final int TRACE_MAX_LENGTH = 4000;

    private Gson gson;

    @Autowired
    private SoapFaultService soapFaultService;
    @Autowired
    private SoapRequestService soapRequestService;

    @Autowired
    public SoapServiceLogger(SoapFaultRepository repository) {
        this.gson = new GsonBuilder().create();
    }

    public void logResponse(String methodName, Object request, Object response) {
        Date inTime = new Date(System.currentTimeMillis());

        String requestJSON = gson.toJson(request);
        requestJSON = trim(requestJSON, REQUEST_MAX_LENGTH);

        String responseJSON = gson.toJson(response);
        responseJSON = trim(responseJSON, RESPONSE_MAX_LENGTH);

        SoapRequest soapRequest = new SoapRequest();
        soapRequest.setMethodName(methodName);
        soapRequest.setRequestData(requestJSON);
        soapRequest.setResponseData(responseJSON);
        soapRequest.setActivityDate(inTime);

        soapRequestService.saveOrUpdate(soapRequest);
    }

    public void logFault(String methodName, Object request, SoapServiceException fault, Throwable re) {
        Date inTime = new Date(System.currentTimeMillis());

        String requestJSON = gson.toJson(request);
        requestJSON = trim(requestJSON, REQUEST_MAX_LENGTH);

        String traceJson = traceAsString(fault, re);
        traceJson = trim(traceJson, TRACE_MAX_LENGTH);

        SoapFault soapFaults = new SoapFault();
        soapFaults.setFaultCode(fault.getCode());
        soapFaults.setFaultMessage(fault.getMessage());
        soapFaults.setTraceData(traceJson);
        soapFaults.setLogDate(inTime);

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
