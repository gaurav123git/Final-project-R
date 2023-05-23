package com.velocity.insurance.addpolicydetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.addpolicydetails.PolicyDetails;
import com.velocity.insurance.addpolicydetails.repository.PolicyDetailsRepository;

@Service
public class PolicyDetailsServiceImpl implements PolicyDetailsService {
	
	@Autowired
	private PolicyDetailsRepository policyDetailsRepository;
	
	@Override
	public PolicyDetails savePolicyDetails(PolicyDetails policyDetails) {
		return policyDetailsRepository.save(policyDetails);
	}

}
