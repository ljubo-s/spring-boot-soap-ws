package com.springboot.soap.ws.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.soap.ws.repo.model.SoapRequest;
import com.springboot.soap.ws.repo.repository.SoapRequestRepository;

@Service
@Transactional
public class SoapRequestServiceImpl implements SoapRequestService{

    @Autowired
    SoapRequestRepository soapRequestRepository;
    
    @Override
    public void saveOrUpdate(SoapRequest soapRequest) {
        soapRequestRepository.save(soapRequest);
    }

}
