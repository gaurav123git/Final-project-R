package com.velocity.insurance.update.userdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.update.userdetails.UserDetails;
import com.velocity.insurance.update.userdetails.repository.UserRepository;
import com.velocity.insurance.update.userdetails.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {

		UserDetails uDetails = userRepository.save(userDetails);
		return uDetails;
	}

}
