package com.velocity.insurance.changepassword.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.changepassword.model.Users;
import com.velocity.insurance.changepassword.repository.UsersRepository;
import com.velocity.insurance.changepassword.service.UsersService;

@RestController
public class UsersController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(UsersController.class);


	@Autowired
	private UsersService userService;
	
	@Autowired
	private UsersRepository userRepository;
	
	@PostMapping("/savePassword")
	public ResponseEntity<Users> saveUser(@RequestBody Users user){
		
		      Users user1 = userService.saveUser(user);
		      
		      return ResponseEntity.ok().body(user1);
	}
	
	@PutMapping("updatePassword/{id}")
    public ResponseEntity<Users> ChangePasswordById(@PathVariable Integer id , @RequestBody Users user) {
    	
    	   Users user2 = userService.ChangePasswordById(id);
    	   
    	   user2.setNewPassword(user.getNewPassword());
    	
    	       Users users = userRepository.save(user2);
    	       
    	       logger.info("In Rest Controller->ChangePassword, Change password of user");
    	       
    	       return ResponseEntity.ok().body(users);
    }

}
