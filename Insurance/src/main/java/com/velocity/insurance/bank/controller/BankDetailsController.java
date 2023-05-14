package com.velocity.insurance.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.bank.model.BankDetails;
import com.velocity.insurance.bank.repository.BankDetailsRepository;
import com.velocity.insurance.bank.service.BankDetailsService;

@RestController
public class BankDetailsController {
	
	@Autowired
	private BankDetailsService bankDetailsService;
	
	@Autowired
	private BankDetailsRepository bankDetailsRepository;
	
	@PostMapping("/saveDetails")
	public ResponseEntity<BankDetails> saveBankDetails(@RequestBody BankDetails bankDetails){
		
		   BankDetails bankDetails2 =  bankDetailsService.saveBankDetails(bankDetails);
		   
		   return ResponseEntity.ok().body(bankDetails2);
		
	}

	 @PutMapping("/updateDetails/{id}")
	public ResponseEntity<BankDetails> getBankDetailsById(@PathVariable Integer id , @RequestBody BankDetails bankDetails){
		
		                      BankDetails bankDetails1 = bankDetailsService.getBankDetailsById(id);
		                      
		                      
		                      bankDetails1.setBankName(bankDetails.getBankName());
		                      
		                      bankDetails1.setBankAccountNumber(bankDetails.getBankAccountNumber()) ;
		                      
		                      bankDetails1.setRoutingNumber(bankDetails.getRoutingNumber());
		                      
		                      bankDetails1.setChequeNumber(bankDetails.getChequeNumber());
		                      
		                      bankDetails1.setAdditionalInformation(bankDetails.getAdditionalInformation());
		                      
		                      
		                    BankDetails bankDetails2 =  bankDetailsRepository.save(bankDetails1);
		                    
		                    
		                    return ResponseEntity.ok().body(bankDetails2);
		                      
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
