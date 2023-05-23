package com.velocity.insurance.updateclaimdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.updateclaimdetails.ClaimDetails;
import com.velocity.insurance.updateclaimdetails.repository.ClaimDetailsRepository;

@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsService {
	
	// inject the repository reference
	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;
	
	@Override
	public ClaimDetails getClaimDetailsById(Integer id) {
		ClaimDetails claimDetails = claimDetailsRepository.findById(id);
		return claimDetails;
	}

}
