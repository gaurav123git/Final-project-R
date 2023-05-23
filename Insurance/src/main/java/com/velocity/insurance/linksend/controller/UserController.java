package com.velocity.insurance.linksend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.linksend.model.User;
import com.velocity.insurance.linksend.service.UserService;

@RestController
public class UserController {

	
	  @Autowired
	  private UserService userService;
	  
	  @Autowired
	  private User user;
	  
	  @GetMapping("/sendingMail")
	  public String sendingMail() {
		  
		  user.setEmailAddress("pallavitribhuvan1997@gmail.com");
		  
		  try {
			  
			  userService.mailSend(user);
			
		} catch (MailException mailException) {
			
			System.out.println(mailException);
		}
		  
		  return "mail send successfully....";
	  
	  
	  }
	  

}
