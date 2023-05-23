package com.velocity.insurance.update.premiumdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.update.premiumdetails.PremiumDetails;
import com.velocity.insurance.update.premiumdetails.service.PremiumDetailsService;

@RestController
public class PremiumDetailsController {

	@Autowired
	private PremiumDetailsService premiumDetailsService ;
	
	   @PostMapping("/updatePremiumDetails")
	   public ResponseEntity<PremiumDetails> savePremiumDetails(@RequestBody PremiumDetails premiumDetails){
		   
		  PremiumDetails premiumDetails2 =  premiumDetailsService.savePremiumDetail(premiumDetails);
		   
		   return ResponseEntity.ok().body(premiumDetails2);
		   
	   }
}
