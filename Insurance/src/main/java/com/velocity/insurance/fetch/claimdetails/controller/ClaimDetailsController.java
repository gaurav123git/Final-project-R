package com.velocity.insurance.fetch.claimdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.fetch.claimdetails.ClaimDetails;
import com.velocity.insurance.fetch.claimdetails.service.ClaimDetailsService;

@RestController
public class ClaimDetailsController {

	// inject the service
	@Autowired
	private ClaimDetailsService claimDetailsService;

	// Design API to save the claim details
	@PostMapping("/saveClaimDetails")
	public ResponseEntity<ClaimDetails> saveClaimDetails(@RequestBody ClaimDetails claimDetails) {
		
		ClaimDetails claimDetails3 = claimDetailsService.saveClaimDetails(claimDetails);
		
		return ResponseEntity.ok().body(claimDetails3);
	}

	// Design API to fetch claim details
	@GetMapping("/getClaimDetails/{id}")
	public ResponseEntity<ClaimDetails> getClaimDetailsById(@PathVariable("id") Integer id) {
		
		ClaimDetails claimDetails4 = claimDetailsService.getClaimDetailsById(id);
		
		return ResponseEntity.ok().body(claimDetails4);
	}

}
