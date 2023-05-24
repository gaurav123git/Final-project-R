package com.velocity.insurance.updateclaimdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.insurance.updateclaimdetails.ClaimDetails;

public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails,Serializable> {
	
	public ClaimDetails findById(Integer id);

}
