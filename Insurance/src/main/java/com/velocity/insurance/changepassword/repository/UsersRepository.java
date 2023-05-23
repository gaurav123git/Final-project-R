package com.velocity.insurance.changepassword.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.changepassword.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Serializable>{

	  public Users findById(Integer id);
}
