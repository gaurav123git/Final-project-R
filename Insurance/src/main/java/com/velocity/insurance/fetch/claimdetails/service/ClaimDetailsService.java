package com.velocity.insurance.fetch.claimdetails.service;

import com.velocity.insurance.fetch.claimdetails.ClaimDetails;

public interface ClaimDetailsService {
	
	public ClaimDetails saveClaimDetails(ClaimDetails claimDetails);
	
	public ClaimDetails getClaimDetailsById(Integer id);

}
