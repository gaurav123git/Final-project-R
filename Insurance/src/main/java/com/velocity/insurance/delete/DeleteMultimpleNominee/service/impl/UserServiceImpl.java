package com.velocity.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.velocity.insurance.model.User;
import com.velocity.insurance.repository.NomineeRepository;
import com.velocity.insurance.repository.UserRepository;
import com.velocity.insurance.service.UserService;

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
    public void deleteUserWithNominees(Integer userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + userId));
        
        userRepository.delete(user);
    }
}

