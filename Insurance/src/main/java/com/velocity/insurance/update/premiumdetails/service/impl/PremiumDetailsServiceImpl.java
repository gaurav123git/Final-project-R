package com.velocity.insurance.update.premiumdetails.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.update.premiumdetails.PremiumDetails;
import com.velocity.insurance.update.premiumdetails.repository.PremiumDetailsRepository;
import com.velocity.insurance.update.premiumdetails.service.PremiumDetailsService;

@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService{
	
	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public PremiumDetails savePremiumDetail(PremiumDetails premiumDetails) {
		PremiumDetails premiumDetails1 = premiumDetailsRepository.save(premiumDetails);
		return premiumDetails1;
	}

	
	
	

}
