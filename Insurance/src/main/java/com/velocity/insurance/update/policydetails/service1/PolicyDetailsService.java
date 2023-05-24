package com.velocity.insurance.update.policydetails.service1;

import com.velocity.insurance.update.policydetails.PolicyDetails;

public interface PolicyDetailsService {
	
	public PolicyDetails savePolicyDetails(PolicyDetails policyDetails);
	
	public PolicyDetails getPolicyDetailsById(Integer id);
}
