package com.example.portfoliobackend.service;

import com.example.portfoliobackend.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findUserByName(String username);
}
