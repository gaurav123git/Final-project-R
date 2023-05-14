package com.velocity.insurance.bank.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.bank.model.BankDetails;
import com.velocity.insurance.bank.repository.BankDetailsRepository;
import com.velocity.insurance.bank.service.BankDetailsService;

@Service
public class BankDetailsServiceImpl implements BankDetailsService{
	
	@Autowired
	BankDetailsRepository bankDetailsRepository ;

	@Override
	public BankDetails saveBankDetails(BankDetails bankDetails) {
		
		      BankDetails bankDetails1 = bankDetailsRepository.save(bankDetails);
		
		return bankDetails1;
	}

	@Override
	public BankDetails getBankDetailsById(Integer id) {
		
	      BankDetails bankDetails =	bankDetailsRepository.getById(id);
		
		return bankDetails;
	}
	
	
	

}
