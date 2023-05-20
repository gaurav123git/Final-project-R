package com.velocity.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.model.PolicyUser;
import com.velocity.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserService userRepository;

	@Override
	public PolicyUser savePolicyUser(PolicyUser policyUser) {
		PolicyUser policyUsers = userRepository.savePolicyUser(policyUser);
		return policyUsers;
	}

}
