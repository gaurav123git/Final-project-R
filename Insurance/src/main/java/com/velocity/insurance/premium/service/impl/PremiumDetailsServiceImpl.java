package com.velocity.insurance.premium.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.premium.model.PremiumDetails;
import com.velocity.insurance.premium.repository.PremiumDetailsRepository;
import com.velocity.insurance.premium.service.PremiumDetailsService;

@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService{
	
	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public void savePremiumDetails(List<PremiumDetails> premiumDetails) {

		premiumDetailsRepository.saveAll(premiumDetails);
		      
	}
	
	

}
