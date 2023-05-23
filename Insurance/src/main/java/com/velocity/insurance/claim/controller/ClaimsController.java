package com.velocity.insurance.claim.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.claim.model.Claims;
import com.velocity.insurance.claim.service.ClaimsService;

@RestController
public class ClaimsController {
	
	private ClaimsService claimsService;
	
	
	@PostMapping("/addMultipleClaim")
	public ResponseEntity<String> saveClaim(@RequestBody List<Claims> claim){
		
		claimsService.saveClaimDetails(claim);
		
		return ResponseEntity.ok("Claim save susccessfully");
	}


}
