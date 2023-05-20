package com.velocity.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.model.PolicyUser;

@Repository
public interface UserRepository extends JpaRepository<PolicyUser, Integer> {

}