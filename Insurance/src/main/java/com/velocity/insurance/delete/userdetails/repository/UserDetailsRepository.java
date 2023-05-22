package com.velocity.insurance.delete.userdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.delete.userdetails.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Serializable> {

}
