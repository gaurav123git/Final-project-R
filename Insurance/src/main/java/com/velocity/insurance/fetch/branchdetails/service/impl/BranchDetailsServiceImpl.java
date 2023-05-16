package com.velocity.insurance.fetch.branchdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.fetch.branchdetails.BranchDetails;
import com.velocity.insurance.fetch.branchdetails.repository.BranchDetailsRepository;
import com.velocity.insurance.fetch.branchdetails.service.BranchDetailsService;

@Service
public class BranchDetailsServiceImpl implements BranchDetailsService {

	// inject the repository reference
	@Autowired
	private BranchDetailsRepository branchDetailsRepository;

	public BranchDetails saveBranchDetails(BranchDetails branchDetails) {
		BranchDetails branchDetails1 = branchDetailsRepository.save(branchDetails);
		return branchDetails1;

	}

	@Override
	public BranchDetails getBranchDetailsById(Integer id) {
		BranchDetails branchDetails = branchDetailsRepository.findById(id);

		return branchDetails;
	}

}
