package com.velocity.insurance.changepassword.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.changepassword.model.Users;
import com.velocity.insurance.changepassword.repository.UsersRepository;
import com.velocity.insurance.changepassword.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	private static final Logger logger=LoggerFactory.getLogger(UsersServiceImpl.class);

	
	
	@Autowired
	private UsersRepository userRepository;
	
	
	@Override
	public Users saveUser(Users user) {
		
		logger.info("In User Service Impl>> saveUsers()");

		
	       Users user1 = userRepository.save(user);
	       
	       return user1;
	}


	@Override
	public Users ChangePasswordById(Integer id) {
		
		    Users users = userRepository.findById(id);
		    
		    return users ;
	}

	
	
}
