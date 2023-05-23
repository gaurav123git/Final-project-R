package com.velocity.insurance.updateclaimdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.velocity.insurance.updateclaimdetails.ClaimDetails;

public class ClaimDetailsController {
	
	
	//inject the service
	@Autowired
	private ClaimDetails ClaimDetailsService;
	
	
	//Design the API to update settlement details into db
	@PutMapping("/updateClaimDetails/{id}")
	public ResponseEntity<ClaimDetails> getClaimDetailsById(@PathVariable ("id") Integer id,
			@RequestBody ClaimDetails claimDetails){ 
		
		ClaimDetails claimDetailss = ClaimDetails.getClaimDetailsById(id);//null
		
		claimDetailss.setId(claimDetails.getId());
		claimDetailss.setClaimid(claimDetails.getClaimid());
	    claimDetailss.setPolicyid(claimDetails.getPolicyid());
		claimDetailss.setClaimstatus(claimDetails.getClaimstatus());
		claimDetailss.setClaimamount(claimDetails.getClaimamount());
		
		
		ClaimDetails claimDetails1 = new ClaimDetails();
	     return ResponseEntity.ok().body(claimDetails1);
	}

}



