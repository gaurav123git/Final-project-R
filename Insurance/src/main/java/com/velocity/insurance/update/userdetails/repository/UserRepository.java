package com.velocity.insurance.update.userdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.update.userdetails.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
