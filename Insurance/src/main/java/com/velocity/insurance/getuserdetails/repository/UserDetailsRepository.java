package com.velocity.insurance.getuserdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.getuserdetails.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails,Serializable> {
	
	public UserDetails findById(Integer Id);

}
