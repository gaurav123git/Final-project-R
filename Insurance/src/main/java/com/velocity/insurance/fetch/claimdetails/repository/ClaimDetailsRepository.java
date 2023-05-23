package com.velocity.insurance.fetch.claimdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.fetch.claimdetails.ClaimDetails;

@Repository
public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails, Serializable>{
	
	public ClaimDetails findById(Integer id);

}
