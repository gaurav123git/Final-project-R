package com.velocity.insurance.claimdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.claimdetails.model.ClaimDetails;
import com.velocity.insurance.claimdetails.service.ClaimDetailsService;

@RestController
public class ClaimDetailsController {

	@Autowired
	private ClaimDetailsService claimDetailsService;
	
	@PostMapping("/saveClaimDetails")
	public ResponseEntity<ClaimDetails>  saveClaimDetails(ClaimDetails claimDetails) {
		
		ClaimDetails claimDetails2 = claimDetailsService.saveClaimDetails(claimDetails);
		
		return ResponseEntity.ok().body(claimDetails2);
	}
}
