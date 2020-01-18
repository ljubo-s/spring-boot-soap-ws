package com.springboot.soap.ws.client;

import com.springboot.soap.ws.client.internal.PersonObjectClient;

public interface SoapClient {

    public String firstRequest(PersonObjectClient person);

    public String secondRequest(PersonObjectClient person);

    public String thirdRequest(PersonObjectClient person);

}
