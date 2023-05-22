package com.velocity.insurance.delete.multiplenominee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.delete.multiplenominee.service.UserService;



@RestController
@RequestMapping("/user")
public class UserNomineeController {
	
    private UserService userService;

    @Autowired
    public UserNomineeController(UserService userService) {
        this.userService = userService;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUserNomineeById(id);
    }
}
