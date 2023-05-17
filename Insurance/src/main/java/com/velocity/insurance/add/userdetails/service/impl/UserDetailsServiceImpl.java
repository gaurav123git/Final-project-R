package com.velocity.insurance.add.userdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.add.userdetails.UserDetails;
import com.velocity.insurance.add.userdetails.repository.UserDetailsRepository;
import com.velocity.insurance.add.userdetails.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	// inject the repository reference
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		UserDetails userDetailss = userDetailsRepository.save(userDetails);
		return userDetailss;
	}

}
