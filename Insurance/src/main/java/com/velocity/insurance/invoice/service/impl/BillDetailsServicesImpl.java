package com.velocity.insurance.invoice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.invoice.model.Bill;
import com.velocity.insurance.invoice.repository.BillDetailsInvoiceRepository;
import com.velocity.insurance.invoice.service.BillDetailsServices;

@Service
public class BillDetailsServicesImpl implements BillDetailsServices {

	@Autowired
	private BillDetailsInvoiceRepository billDetailsRepository;
	
	@Override
	public Bill saveBillDetails(Bill billDetails) {
		
		Bill billDetails1 =  billDetailsRepository.save(billDetails);
        
        return billDetails1;
	}

}
