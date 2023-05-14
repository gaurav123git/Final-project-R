package com.velocity.insurance.bank.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.bank.model.BankDetails;

@Repository
public interface BankDetailsRepository extends CrudRepository<BankDetails, Serializable>{
	
	
	public BankDetails getById(Integer id);

}
