package com.velocity.insurance.settlement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.settlement.model.SettlementDetails;
import com.velocity.insurance.settlement.service.SettlementDetailsService;


@RestController
public class SettlementDetailsController {
	
	@Autowired
	private SettlementDetailsService settlementDetailsService;
	
	  @PostMapping("/saveSettlements")
	public ResponseEntity<SettlementDetails> saveSettlementDetails(@RequestBody SettlementDetails settlementDetails){
		
		SettlementDetails settlements =	settlementDetailsService.saveSettlementDetails(settlementDetails);
		
		
		return ResponseEntity.ok().body(settlements);
	}

	  
	     @DeleteMapping("/deleteData/{id}")
	    public void deleteSettlementDetailsById(@PathVariable("id") Integer id) {
	    	
	    	settlementDetailsService.deleteSettlementDetailsById(id);
	    }
}
