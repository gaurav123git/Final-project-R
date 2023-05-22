package com.velocity.insurance.add.settlementdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.add.settlementdetails.SettlementDetails;
import com.velocity.insurance.add.settlementdetails.service.SettlementDetailsService;

@RestController

public class SettlementDetailsController {
	
	private SettlementDetailsService settlementDetailsService;

    @Autowired
    public SettlementDetailsController(SettlementDetailsService settlementDetailsService) {
        this.settlementDetailsService = settlementDetailsService;
    }

    @PostMapping("/saveSettlementDetails")
    public ResponseEntity<SettlementDetails> addSettlementDetails(@RequestBody SettlementDetails settlementDetails) {
        SettlementDetails addedSettlementDetails = settlementDetailsService.saveSettlementDetails(settlementDetails);
        return new ResponseEntity<>(addedSettlementDetails, HttpStatus.CREATED);
    }
}


