package com.velocity.insurance.updatesettlementdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.velocity.insurance.updatesettlementdetails.SettlementDetails;
import com.velocity.insurance.updatesettlementdetails.repository.SettlementDetailsRepository;
import com.velocity.insurance.updatesettlementdetails.service.SettlementDetailsService;

@RestController
public class SettlementDetailsController {
	
	
	
	//inject the service
	@Autowired
	private SettlementDetailsService settlementDetailsService;
	
	//Design the API to update settlement details into db
	@PutMapping("/updateSettlementDetails/{id}")
	public ResponseEntity<SettlementDetails> getSettlementDetailsById(@PathVariable ("id") Integer id,
			@RequestBody SettlementDetails settlementDetails) {
		
		SettlementDetails settlementDetailss = SettlementDetails.getSettlementDetailsById(id);
		
		settlementDetailss.setId(settlementDetails.getId());
		settlementDetailss.setSettlementId(settlementDetails.getSettlementId());
	    settlementDetailss.setDate(settlementDetails.getDate());
		settlementDetailss.setAmount(settlementDetails.getAmount());
		settlementDetailss.setClaimId(settlementDetails.getClaimId());
		settlementDetailss.setStatus(settlementDetails.getStatus());
		
		SettlementDetails settlementDetails1 = new SettlementDetails();
	     return ResponseEntity.ok().body(settlementDetails1);
	}

}
		


