package com.velocity.insurance.fetch.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.fetch.policy.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {
    
}

