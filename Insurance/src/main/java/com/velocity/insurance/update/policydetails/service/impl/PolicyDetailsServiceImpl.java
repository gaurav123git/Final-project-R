package com.velocity.insurance.update.policydetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.update.policydetails.PolicyDetails;
import com.velocity.insurance.update.policydetails.repository.PolicyDetailsRepository;


@Service
public class PolicyDetailsServiceImpl implements PolicyDetailsService {

	// inject the repository reference
	@Autowired
	private PolicyDetailsRepository policyDetailsRepository;

	@Override
	public PolicyDetails savePolicyDetails(PolicyDetails policyDetails) {
		PolicyDetails policyDetails1 = policyDetailsRepository.save(policyDetails);
		return policyDetails1;
	}

	@Override
	public PolicyDetails getPolicyDetailsById(Integer id) {
		PolicyDetails policyDetails2 = policyDetailsRepository.findById(id);
		return policyDetails2;
	}

}
