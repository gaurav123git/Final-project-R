package com.velocity.insurance.userlogin.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.userlogin.User;
import com.velocity.insurance.userlogin.service.UserService;

@RestController
public class UserController {

	// inject the service
	@Autowired
	private UserService userService;

	// Design the API user to log in
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) throws InvalidInput {

		User users = userService.saveUser(user);

		System.out.println("Enter the username");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		System.out.println("Enter the password");
		String password = scanner.next();

		if ((userName.equals(user.getUsername()) && (password.equals(user.getPassword())))) {
			System.out.println("LogIn successfully...");
		} else {
			throw new InvalidInput("Please enter valid username and password");
		}

		return ResponseEntity.ok().body(users);
	}

}
