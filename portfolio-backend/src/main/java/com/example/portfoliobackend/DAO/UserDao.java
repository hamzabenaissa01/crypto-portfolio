package com.example.portfoliobackend.DAO;

import com.example.portfoliobackend.entity.User;

public interface UserDao {

    User findByUserName(String username);
}
