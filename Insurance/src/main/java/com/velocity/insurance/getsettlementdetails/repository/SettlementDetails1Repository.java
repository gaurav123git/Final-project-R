package com.velocity.insurance.getsettlementdetails.repository;

import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.getsettlementdetails.SettlementDetails1;

@Repository
public interface SettlementDetails1Repository extends CrudRepository<SettlementDetails1,Serializable> {
	
	public SettlementDetails1 findById(Integer Id);

}
