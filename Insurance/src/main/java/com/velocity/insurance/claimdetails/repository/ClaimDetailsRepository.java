package com.velocity.insurance.claimdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.claimdetails.model.ClaimDetails;

@Repository
public interface ClaimDetailsRepository extends JpaRepository<ClaimDetails, Integer>{

}
