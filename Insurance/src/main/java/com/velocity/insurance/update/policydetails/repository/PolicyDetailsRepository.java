package com.velocity.insurance.update.policydetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.update.policydetails.PolicyDetails;

@Repository
public interface PolicyDetailsRepository extends CrudRepository<PolicyDetails, Serializable> {
	
	public PolicyDetails findById(Integer id);

}
