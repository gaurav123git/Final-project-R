package com.velocity.insurance.transactionDetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocit.insurance.transactionDetails.model.TransactionDetails;
import com.velocity.insurance.transactionDetails.repository.TransactionDetailsRepository;
import com.velocity.insurance.transactionDetails.service.TransactionDetailsService;
@Service
public class TransactionDetailsServiceImpl implements TransactionDetailsService {

	
	@Autowired
	private  TransactionDetailsRepository transactionDetailsRepository;
	
	
	@Override
	public TransactionDetails saveDetails(TransactionDetails transactionDetails) {
		// TODO Auto-generated method stub
		
		TransactionDetails trans = transactionDetailsRepository.save(transactionDetails);
		return trans;
	}

}
