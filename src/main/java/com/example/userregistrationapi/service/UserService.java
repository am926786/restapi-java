package com.example.userregistrationapi.service;
import com.example.userregistrationapi.repository.*;

import com.example.userregistrationapi.entity.User;
import com.example.userregistrationapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean registerUser(User newUser) {
        // Assume validation and any business logic here
        userRepository.save(newUser);
        return true;
    }

    public User fetchUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
