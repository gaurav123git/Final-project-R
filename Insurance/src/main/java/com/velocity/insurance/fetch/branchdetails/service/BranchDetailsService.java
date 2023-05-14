package com.velocity.insurance.fetch.branchdetails.service;

import com.velocity.insurance.fetch.branchdetails.BranchDetails;

public interface BranchDetailsService {
	
	public BranchDetails saveBranchDetails(BranchDetails branchDetails);
	
	public BranchDetails getBranchDetailsById(Integer id);

}
