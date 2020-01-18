package com.springboot.soap.ws.service.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.soap.ws.client.SoapClient;
import com.springboot.soap.ws.service.SoapService;
import com.springboot.soap.ws.client.internal.PersonObjectClient;

@Service
public class StandardSoapService implements SoapService {

    @Autowired
    private SoapClient soapClient;

    public String firstRequest(PersonObjectService person) {
        System.out.println("    firstRequest service");
        PersonObjectClient personClient = new PersonObjectClient();
        personClient.setName(person.getName());
        personClient.setLastname(person.getLastname());
        personClient.setEmail(person.getEmail());
        personClient.setStatus(person.getStatus());

        return soapClient.firstRequest(personClient);
    }

    public String secondRequest(PersonObjectService person) {
        System.out.println(" secondRequest service");
        PersonObjectClient personClient = new PersonObjectClient();
        personClient.setName(person.getName());
        personClient.setLastname(person.getLastname());
        personClient.setEmail(person.getEmail());
        personClient.setStatus(person.getStatus());

        return soapClient.secondRequest(personClient);
    }

    public String thirdRequest(PersonObjectService person) {
        System.out.println(" thirdRequest service");
        PersonObjectClient personClient = new PersonObjectClient();
        personClient.setName(person.getName());
        personClient.setLastname(person.getLastname());
        personClient.setEmail(person.getEmail());
        personClient.setStatus(person.getStatus());

        return soapClient.thirdRequest(personClient);
    }

}
