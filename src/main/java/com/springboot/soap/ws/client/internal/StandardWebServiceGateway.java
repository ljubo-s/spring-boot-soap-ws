package com.springboot.soap.ws.client.internal;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class StandardWebServiceGateway extends WebServiceGatewaySupport {

    public Object sendAndReceive(Object request) {
        return getWebServiceTemplate().marshalSendAndReceive(request);
    }

}
