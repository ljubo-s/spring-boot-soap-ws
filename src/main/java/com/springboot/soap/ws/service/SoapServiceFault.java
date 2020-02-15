package com.springboot.soap.ws.service;

public enum SoapServiceFault {

    SERVICE_ERROR("SOAP-00001", "Service Error"),
    ERROR_ON_FIRST_REQUEST("SOAP-00002", "Cannot execute First request on Service layer"),
    ERROR_ON_SECOND_REQUEST("SOAP-00003", "Cannot execute Second request on Service layer"),
    ERROR_ON_THIRD_REQUEST("SOAP-00004", "Cannot execute Third request on Service layer"),;

    private String code;
    private String message;

    private SoapServiceFault(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public SoapServiceFault getDefault() {
        return SERVICE_ERROR;
    }

    public SoapServiceFault getFault(String code) {
        SoapServiceFault[] faults = SoapServiceFault.values();
        for (SoapServiceFault fault : faults) {
            if (fault.code.equals(code)) {
                return fault;
            }
        }
        return getDefault();
    }

    @Override
    public String toString() {
        return "[" + code + " | " + message + "]";
    }

}
