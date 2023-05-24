package com.velocity.insurance.userDetail.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.userDetail.model.UserDetail;
@Repository
public interface UserDetailRepository extends CrudRepository<UserDetail, Serializable> {

	
	public UserDetail findById(Integer id);
}
