package com.velocity.insurance.deletepremiumdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.deletepremiumdetails.service.PremiumDetailsService;

@RestController
public class PremiumDetailsController {
	
	// inject the PremiumDetailsService
	@Autowired
	private PremiumDetailsService premiumDetailsService;
	
	@DeleteMapping("/deletepremiumdetails/{id}")
	      public void deletePremiumDetailsById(@PathVariable("id")Integer id) throws
	  Exception {
		          premiumDetailsService.deletePremiumDetails(id);
		
	}
 
}
