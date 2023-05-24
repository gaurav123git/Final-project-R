package com.velocity.insurance.userDetail.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.userDetail.model.UserDetail;
import com.velocity.insurance.userDetail.repository.UserDetailRepository;
import com.velocity.insurance.userDetail.services.UserDetailServices;
@Service
public class UserDetailServicesImpl implements UserDetailServices {

	@Autowired
private UserDetailRepository userDetailRepository;	
	
	@Override
	public UserDetail getUserDetailById(Integer id) {
		// TODO Auto-generated method stub
		UserDetail userDetail = userDetailRepository.findById(id);
		
		return userDetail;
	}

}
