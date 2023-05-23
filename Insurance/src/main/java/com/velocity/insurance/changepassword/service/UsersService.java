package com.velocity.insurance.changepassword.service;

import com.velocity.insurance.changepassword.model.Users;

public interface UsersService {

	    public Users saveUser(Users user);
	
	    public Users ChangePasswordById(Integer id);
}
