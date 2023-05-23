package com.velocity.insurance.claim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.claim.model.Claims;
import com.velocity.insurance.claim.repository.ClaimsRepository;
import com.velocity.insurance.claim.service.ClaimsService;

@Service
public class ClaimsServiceImpl implements ClaimsService {

	  @Autowired
	  private ClaimsRepository claimsRepository;
	
	@Override
	public void saveClaimDetails(List<Claims> claim) {

		claimsRepository.saveAll(claim);
	}

}
