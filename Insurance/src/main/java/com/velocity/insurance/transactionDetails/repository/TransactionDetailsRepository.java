package com.velocity.insurance.transactionDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocit.insurance.transactionDetails.model.TransactionDetails;
@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Integer> {
	
	

}
