package com.velocity.insurance.duration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.duration.model.AllPremium;
import com.velocity.insurance.duration.service.AllPremiumService;

@RestController
public class AllPremiumController {

	@Autowired
	private AllPremiumService allPremiumService;

	@PostMapping("/saveAllData")
	public ResponseEntity<String> savePremium(@RequestBody List<AllPremium> premium) {

		allPremiumService.saveAllPremium(premium);
		
		return ResponseEntity.ok("multiple data inserted successfully........");
	}

	@GetMapping("getAllData/{duration}")
   public  ResponseEntity<List<AllPremium>> getPremiumByDuration(@PathVariable("duration") String duration) {
   	
   	         List<AllPremium> premium1 = allPremiumService.getPremiumByDuration(duration); 
   	         
   	         return ResponseEntity.ok().body(premium1);
	}
   	                
}
