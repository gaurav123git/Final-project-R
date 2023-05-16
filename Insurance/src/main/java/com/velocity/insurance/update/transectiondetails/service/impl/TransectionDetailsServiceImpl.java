package com.velocity.insurance.update.transectiondetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.update.transectiondetails.TransectionDetails;
import com.velocity.insurance.update.transectiondetails.repository.TransectionDetailsRepository;
import com.velocity.insurance.update.transectiondetails.service.TransectionDetailsService;

@Service
public class TransectionDetailsServiceImpl implements TransectionDetailsService {
	
	// inject the repository reference reference
	@Autowired
	private TransectionDetailsRepository transectionDetailsRepository;

	@Override
	public TransectionDetails getTransectionDetailsById(Integer id) {
		
		TransectionDetails transectionDetails=transectionDetailsRepository.findById(id);
		
		return transectionDetails;
	}

}
