package com.springboot.soap.ws.client.internal;

import org.springframework.stereotype.Component;
import com.springboot.soap.ws.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class StandardSoapClient implements SoapClient {

    @Autowired
    private StandardWebServiceGateway gateway;

    @Override
    public String firstRequest(PersonObjectClient person) {

        System.out.println("      Client firstRequest");

        RequestToPDF requestToPDF = new RequestToPDF();
        requestToPDF.setName(person.getName());
        requestToPDF.setLastname(person.getLastname());
        requestToPDF.setEmail(person.getEmail());
        requestToPDF.setStatus(person.getStatus().toString());

        ResponseToPDF responseToPDF = new ResponseToPDF();
        try {
            responseToPDF = (ResponseToPDF) gateway.sendAndReceive(requestToPDF);
            responseToPDF.setMessage("      Client firstRequest try");
            return responseToPDF.getMessage();
        } catch (RuntimeException re) {
            return responseToPDF.getMessage();
        }
    }

    @Override
    public String secondRequest(PersonObjectClient person) {
        System.out.println("      Client secondtRequest");

        RequestForPrint requestForPrint = new RequestForPrint();
        requestForPrint.setName(person.getName());
        requestForPrint.setLastname(person.getLastname());
        requestForPrint.setEmail(person.getEmail());
        requestForPrint.setStatus(person.getStatus().toString());

        ResponseForPrint responseForPrint = new ResponseForPrint();
        try {
            responseForPrint = (ResponseForPrint) gateway.sendAndReceive(requestForPrint);
            System.out.println("      Client secondtRequest try");
            responseForPrint.setMessage("        Client secondtRequest");
            return responseForPrint.getMessage();
        } catch (RuntimeException re) {
            return responseForPrint.getMessage();
        }
    }

    @Override
    public String thirdRequest(PersonObjectClient person) {
        System.out.println("      Client thirdRequest");

        RequestForDB requestForDB = new RequestForDB();
        requestForDB.setId(person.getId().toString());

        ResponseForDB responseForDB = new ResponseForDB();
        try {
            responseForDB = (ResponseForDB) gateway.sendAndReceive(requestForDB);
            System.out.println("      Client thirdRequest try");
            responseForDB.setMessage("      Client thirdRequest");
            return responseForDB.getMessage();
        } catch (RuntimeException re) {
            return responseForDB.getMessage();
        }
    }

}
