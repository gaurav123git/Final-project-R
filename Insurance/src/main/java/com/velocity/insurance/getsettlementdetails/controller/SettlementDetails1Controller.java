package com.velocity.insurance.getsettlementdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.getsettlementdetails.SettlementDetails1;
import com.velocity.insurance.getsettlementdetails.service.SettlementDetails1Service;

@RestController
public class SettlementDetails1Controller {
	
	@Autowired
	private SettlementDetails1Service settlementDetailsService;
	
	
	@GetMapping("/getSettlementDetails/{id}")
         public ResponseEntity<SettlementDetails1> getSettlementDetailsById(@PathVariable ("id") Integer id) {
			
         SettlementDetails1 settlementDetails = new SettlementDetails1();
 		 return ResponseEntity.ok().body(settlementDetails);

    }
}