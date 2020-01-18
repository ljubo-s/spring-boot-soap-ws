package com.springboot.soap.ws.service;

public class SoapServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private SoapServiceFault fault;

    public SoapServiceException(SoapServiceFault fault) {
        super(fault.getMessage());
        this.fault = fault;
    }

    public SoapServiceException(SoapServiceFault fault, Throwable e) {
        super(fault.getMessage());
        this.fault = fault;
    }

    public String getCode() {
        return fault.getCode();
    }

    public String getMessage() {
        return fault.getMessage();
    }

    @Override
    public String toString() {
        return "SoapServiceException: " + fault.toString();
    }

}
