package com.springboot.soap.ws.repo.model;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "soapfault")
public class SoapFault {

    private BigInteger id;
    private String faultCode;
    private String faultMessage;
    private String traceData;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private Date logDate;

    public SoapFault() {
        super();
    }

    public SoapFault(BigInteger entityId, String faultCode, String faultMessage, String inputData, String traceData, Date logDate) {
        super();
        this.faultCode = faultCode;
        this.faultMessage = faultMessage;
        this.traceData = traceData;

        if (logDate == null) {
            this.logDate = new Date(System.currentTimeMillis());
        } else {
            this.logDate = logDate;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    @Column(name = "fault_code")
    public String getFaultCode() {
        return this.faultCode;
    }

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    @Column(name = "fault_message")
    public String getFaultMessage() {
        return this.faultMessage;
    }

    public void setFaultMessage(String faultMessage) {
        this.faultMessage = faultMessage;
    }

    @Column(name = "trace_data")
    public String getTraceData() {
        return this.traceData;
    }

    public void setTraceData(String traceData) {
        this.traceData = traceData;
    }

    @Column(name = "log_date")
    public Date getLogDate() {
        return this.logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}
