package com.velocity.insurance.updatesettlementdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.updatesettlementdetails.SettlementDetails;

@Repository
public interface SettlementDetailsRepository extends CrudRepository<SettlementDetails,Serializable>{
	
	public SettlementDetails findById(Integer id);
} 


