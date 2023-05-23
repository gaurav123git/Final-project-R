package com.velocity.insurance.getuserdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.getuserdetails.UserDetails;
import com.velocity.insurance.getuserdetails.repository.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@Override
	public UserDetails getUserDetailsById(Integer Id) {
		UserDetails userDetails = userDetailsRepository.findById(Id);
		return userDetails;
	}
	
	

}
