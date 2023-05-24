package com.velocity.insurance.getmultiplenominee.service.imlp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.getmultiplenominee.repository.UserRepository;
import com.velocity.insurance.getmultiplenominee.service.UserService;
import com.velocity.insurance.getmultiplenomineedetails.User;

@Service
public class UserServiceImpl implements UserService{
	
       @Autowired
       private UserRepository userRepository;
       
       @Override
       public User getUser(User user) {
              User user1 = userRepository.save(user);
    	      return user1;
       }
       


}
