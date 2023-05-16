package com.velocity.insurance.update.transectiondetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.update.transectiondetails.TransectionDetails;

@Repository
public interface TransectionDetailsRepository extends CrudRepository<TransectionDetails, Serializable> {
	
	public TransectionDetails findById(Integer id);

}
