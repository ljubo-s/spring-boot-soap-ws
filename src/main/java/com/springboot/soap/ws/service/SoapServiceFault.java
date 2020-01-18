package com.springboot.soap.ws.service;

public enum SoapServiceFault {

    SERVICE_ERROR("Soap-00001", "Service error"),
    CANNOT_REQUEST_TO_PDF("Soap-00002", "Cannot send request to pdf");

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
