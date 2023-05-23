package com.velocity.insurance.get.premiumdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.get.premiumdetails.PremiumDetails;
import com.velocity.insurance.get.premiumdetails.service.PremiumDetailsService;

@RestController
public class PremiumDetailsController {

	// inject the service
	@Autowired
	private PremiumDetailsService premiumDetailsService;

	// Design API to save premiumdetails to database
	
	@PostMapping("/savePremiumDetails")
	public ResponseEntity<PremiumDetails> savePremiumDetail(@RequestBody PremiumDetails premiumDetail) {

		PremiumDetails premiumDetails3 = premiumDetailsService.savePremiumDetail(premiumDetail);

		return ResponseEntity.ok().body(premiumDetails3);
	}

	// Design API to get the premiumdetails from database
	
	@GetMapping("/getpremiumDetails/{id}")
	public ResponseEntity<PremiumDetails> getPremiumDetailsById(@PathVariable("id") Integer id) {
		
		PremiumDetails PremiumDetails4 = premiumDetailsService.getPremiumDetailsById(id);
		
		return ResponseEntity.ok().body(PremiumDetails4);
	}

}
