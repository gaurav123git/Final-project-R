package com.velocity.insurance.deletedata.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.deletedata.model.DeleteDetail;

@Repository
public interface DeleteDetailRepository extends CrudRepository<DeleteDetail, Serializable> {
	
	

}
