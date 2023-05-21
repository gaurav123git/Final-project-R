package com.velocity.insurance.get.premiumdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.get.premiumdetails.PremiumDetails;
import com.velocity.insurance.get.premiumdetails.repository.PremiumDetailsRepository;
import com.velocity.insurance.get.premiumdetails.service.PremiumDetailsService;

@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {

	// inject the repository reference
	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public PremiumDetails savePremiumDetail(PremiumDetails premiumDetail) {
		PremiumDetails premiumDetails1 = premiumDetailsRepository.save(premiumDetail);
		return premiumDetails1;
	}

	@Override
	public PremiumDetails getPremiumDetailsById(Integer id) {
		PremiumDetails premiumDetails2 = premiumDetailsRepository.findById(id);
		return premiumDetails2;
	}

}
