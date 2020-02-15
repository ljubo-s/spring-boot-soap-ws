package com.springboot.soap.ws.repo.repository;

import org.springframework.data.repository.CrudRepository;
import com.springboot.soap.ws.repo.model.SoapRequest;

public interface SoapRequestRepository  extends CrudRepository<SoapRequest, Long> {

}
