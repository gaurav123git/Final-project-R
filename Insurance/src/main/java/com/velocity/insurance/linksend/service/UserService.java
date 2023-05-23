package com.velocity.insurance.linksend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.velocity.insurance.linksend.model.User;

@Service
public class UserService {
	

	  private JavaMailSender javaMailSender;

	  @Autowired
	public UserService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	  
	  public void mailSend(User user) {
		  
		 SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		 
		 simpleMailMessage.setTo(user.getEmailAddress());
		 simpleMailMessage.setSubject("Forgot Password link");
		 simpleMailMessage.setText("https://www.facebook.com/");
		 
		 javaMailSender.send(simpleMailMessage);
		 
	  }
	  

}
