package com.velocity.insurance.userlogin.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.userlogin.User;

@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {

}
