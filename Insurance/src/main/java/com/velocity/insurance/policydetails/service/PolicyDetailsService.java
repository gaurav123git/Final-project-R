package com.velocity.insurance.policydetails.service;

import com.velocity.insurance.update.policydetails.PolicyDetails;

public interface PolicyDetailsService {
	
	public PolicyDetails savePolicyDetails(PolicyDetails policyDetails);
	
	public PolicyDetails getPolicyDetailsById(Integer id);
	

}
