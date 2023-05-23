package com.velocity.insurance.invoice.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.invoice.model.Premium;

@Repository
public interface PremiumDetailsInvoiceRepository extends CrudRepository<Premium, Serializable>{
	
	
	  public Premium findById(Integer id);


}
