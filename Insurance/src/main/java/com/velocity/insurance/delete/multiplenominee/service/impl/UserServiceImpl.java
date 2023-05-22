package com.velocity.insurance.delete.multiplenominee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.velocity.insurance.delete.multiplenominee.User;
import com.velocity.insurance.delete.multiplenominee.repository.NomineeRepository;
import com.velocity.insurance.delete.multiplenominee.repository.UserRepository;
import com.velocity.insurance.delete.multiplenominee.service.UserService;



@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private NomineeRepository nomineeRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, NomineeRepository nomineeRepository) {
        this.userRepository = userRepository;
        this.nomineeRepository = nomineeRepository;
    }

   

	@Override
	@Transactional
	public void deleteUserNomineeById(Integer id) {
		User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + id));
		userRepository.delete(user);
	}
}
