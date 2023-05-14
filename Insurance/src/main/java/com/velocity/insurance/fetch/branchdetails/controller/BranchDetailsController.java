package com.velocity.insurance.fetch.branchdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.fetch.branchdetails.BranchDetails;
import com.velocity.insurance.fetch.branchdetails.service.BranchDetailsService;

@RestController
public class BranchDetailsController {

	// inject the service
	@Autowired
	private BranchDetailsService branchDetailsService;

	// API for save the data
	@PostMapping("/save")
	public ResponseEntity<BranchDetails> saveBranchDetails(@RequestBody BranchDetails branchDetails) {
		
		BranchDetails branchDetails2 = branchDetailsService.saveBranchDetails(branchDetails);
		
		return ResponseEntity.ok().body(branchDetails2) ;
	}

	// Design the API to fetch the BranchDetails from database
	@GetMapping("/getData/{id}")
	public ResponseEntity<BranchDetails> getBranchDetailsById(@PathVariable("id") Integer id) {

		BranchDetails branchDetails = branchDetailsService.getBranchDetailsById(id);

		return ResponseEntity.ok().body(branchDetails);
	}

}
