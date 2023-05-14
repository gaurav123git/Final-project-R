package com.velocity.insurance.bank.service;

import com.velocity.insurance.bank.model.BankDetails;

public interface BankDetailsService {

	
	  public BankDetails saveBankDetails(BankDetails bankDetails);
	  
	  public BankDetails getBankDetailsById(Integer id);
}
