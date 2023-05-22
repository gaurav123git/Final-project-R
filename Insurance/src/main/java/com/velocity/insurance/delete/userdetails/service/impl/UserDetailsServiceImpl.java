package com.velocity.insurance.delete.userdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.delete.userdetails.repository.UserDetailsRepository;
import com.velocity.insurance.delete.userdetails.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public void deleteById(Integer id) {
		
		userDetailsRepository.deleteById(id);
		
	}

}
