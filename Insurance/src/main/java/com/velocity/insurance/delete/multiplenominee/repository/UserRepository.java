package com.velocity.insurance.delete.multiplenominee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.delete.multiplenominee.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {

}
