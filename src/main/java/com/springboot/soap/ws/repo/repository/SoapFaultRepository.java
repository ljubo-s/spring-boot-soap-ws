package com.springboot.soap.ws.repo.repository;

import org.springframework.data.repository.CrudRepository;
import com.springboot.soap.ws.repo.model.SoapFault;

public interface SoapFaultRepository extends CrudRepository<SoapFault, Long> {

}
