package com.velocity.insurance.premium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.premium.model.PremiumDetails;
import com.velocity.insurance.premium.service.PremiumDetailsService;

@RestController
public class PremiumDetailsController {

	@Autowired
	private PremiumDetailsService premiumDetailsService ;
	
	   @PostMapping("/saveMultipleData")
	   public ResponseEntity<String> savePremiumDetails(@RequestBody List<PremiumDetails> premiumDetails){
		   
		   premiumDetailsService.savePremiumDetails(premiumDetails);
		   
		   return ResponseEntity.ok("multiple data inserted successfully");
		   
	   }
}
