package com.velocity.insurance.transection.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.transection.model.TransectionDetails;

@Repository
public interface TransectionDetailsRepository extends CrudRepository<TransectionDetails, Serializable>{
	
	
	@Query(value = "select * from transectiondetails e where status=?1", nativeQuery = true)
	
	public List<TransectionDetails> findByStatus(String status);


	
	
	

}
