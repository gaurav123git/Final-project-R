package com.velocity.insurance.transactionDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocit.insurance.transactionDetails.model.TransactionDetails;
import com.velocity.insurance.transactionDetails.service.TransactionDetailsService;

@RestController
public class TransactionDetailsController {
	
	@Autowired
	private TransactionDetailsService transactionDetailsService;
	
	@PostMapping("/saveData")
	public ResponseEntity<TransactionDetails> saveData(@RequestBody TransactionDetails transactionDetails ) {
		
		TransactionDetails td1 = transactionDetailsService.saveDetails(transactionDetails);
		return ResponseEntity.ok().body(td1);
	}
	
	

}
