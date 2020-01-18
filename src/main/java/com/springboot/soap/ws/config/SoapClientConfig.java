package com.springboot.soap.ws.config;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;
import com.springboot.soap.ws.client.internal.StandardWebServiceGateway;

@Configuration
@PropertySource("classpath:/client/soap.client.properties")
public class SoapClientConfig {

    @Value("${soap.uri}")
    private String uri;

    @Value("${soap.username}")
    private String username;

    @Value("${soap.password}")
    private String password;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.springboot.soap.ws.client.internal");
        return marshaller;
    }

    @Bean
    public HttpComponentsMessageSender messageSender() {
        UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(username, password);
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        messageSender.setCredentials(credentials);
        return messageSender;
    }

    @Bean
    public StandardWebServiceGateway navisionWebServiceGateway(Jaxb2Marshaller marshaller, HttpComponentsMessageSender messageSender) {
        StandardWebServiceGateway gateway = new StandardWebServiceGateway();
        gateway.setDefaultUri(uri);
        gateway.setMarshaller(marshaller);
        gateway.setUnmarshaller(marshaller);
        gateway.setMessageSender(messageSender);
        return gateway;
    }

}
