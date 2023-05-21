package com.velocity.insurance.fetch.claimdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.fetch.claimdetails.ClaimDetails;
import com.velocity.insurance.fetch.claimdetails.repository.ClaimDetailsRepository;
import com.velocity.insurance.fetch.claimdetails.service.ClaimDetailsService;

@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsService {

	// inject the repository reference
	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;

	@Override
	public ClaimDetails saveClaimDetails(ClaimDetails claimDetails) {
		ClaimDetails claimDetails1 = claimDetailsRepository.save(claimDetails);
		return claimDetails1;
	}

	@Override
	public ClaimDetails getClaimDetailsById(Integer id) {
		ClaimDetails claimDetails2 = claimDetailsRepository.findById(id);
		return claimDetails2;
	}

}
