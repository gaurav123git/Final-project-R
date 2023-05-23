package com.velocity.insurance.deletepremiumdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.deletepremiumdetails.repository.PremiumDetailsRepository;

@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {
	
	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;
	
	@Override
	public void deletePremiumDetails(Integer id) {
		premiumDetailsRepository.deleteById(id);
	}

}
