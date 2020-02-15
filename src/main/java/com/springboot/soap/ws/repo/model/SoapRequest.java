package com.springboot.soap.ws.repo.model;

import java.util.Date;
import java.math.BigInteger;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "soaprequest")
public class SoapRequest {

    private BigInteger id;
    private String requestData;
    private String responseData;
    private String methodName;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private Date activityDate;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    @Column(name = "request_data")
    public String getRequestData() {
        return this.requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    @Column(name = "response_data")
    public String getResponseData() {
        return this.responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    @Column(name = "activity_date")
    public Date getActivityDate() {
        return this.activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    @Column(name = "method_name")
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

}
