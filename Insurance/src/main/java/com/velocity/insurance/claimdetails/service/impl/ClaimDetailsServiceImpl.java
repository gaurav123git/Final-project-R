package com.velocity.insurance.claimdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.claimdetails.model.ClaimDetails;
import com.velocity.insurance.claimdetails.repository.ClaimDetailsRepository;
import com.velocity.insurance.claimdetails.service.ClaimDetailsService;

@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsService {
	
	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;

	@Override
	public ClaimDetails saveClaimDetails(ClaimDetails claimDetails) {

		ClaimDetails claimDetails1 = claimDetailsRepository.save(claimDetails);
		return claimDetails1;
	}

}
