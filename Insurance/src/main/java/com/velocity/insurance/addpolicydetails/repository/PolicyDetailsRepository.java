package com.velocity.insurance.addpolicydetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.addpolicydetails.PolicyDetails;

@Repository
public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails,Integer> {

}
