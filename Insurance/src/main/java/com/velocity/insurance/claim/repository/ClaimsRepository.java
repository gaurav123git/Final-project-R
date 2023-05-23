package com.velocity.insurance.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.claim.model.Claims;

@Repository
public interface ClaimsRepository extends JpaRepository<Claims, Integer>{
	
	

}
