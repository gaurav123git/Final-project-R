package com.velocity.insurance.policyscheduledetailsdelete.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.policyscheduledetailsdelete.BranchDetails;

@Repository
public interface BranchDetailsRepository extends CrudRepository<BranchDetails,Serializable>{
	
	public BranchDetails findById(Integer id);
}


