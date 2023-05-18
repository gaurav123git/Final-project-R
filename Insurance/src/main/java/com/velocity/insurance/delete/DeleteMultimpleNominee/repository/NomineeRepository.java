package com.velocity.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.insurance.model.Nominee;

public interface NomineeRepository extends JpaRepository<Nominee, Integer> {
	
}

