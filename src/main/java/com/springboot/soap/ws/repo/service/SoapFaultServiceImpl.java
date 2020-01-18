package com.springboot.soap.ws.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.soap.ws.repo.model.SoapFault;
import com.springboot.soap.ws.repo.repository.SoapFaultRepository;

@Service
@Transactional
public class SoapFaultServiceImpl implements SoapFaultService {

    @Autowired
    SoapFaultRepository soapFaultRepository;
    
    @Override
    public void saveOrUpdate(SoapFault soapFault) {
        soapFaultRepository.save(soapFault);
    }

}
