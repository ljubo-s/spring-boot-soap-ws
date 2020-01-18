package com.springboot.soap.ws.service;

import com.springboot.soap.ws.service.internal.PersonObjectService;

public interface SoapService {

     String firstRequest(PersonObjectService person);

     String secondRequest(PersonObjectService person);

     String thirdRequest(PersonObjectService person);

}
