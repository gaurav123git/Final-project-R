package com.velocity.insurance.userlogin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.userlogin.User;
import com.velocity.insurance.userlogin.repository.UserRepository;
import com.velocity.insurance.userlogin.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// inject the repository reference
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

}
