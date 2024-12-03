package com.example.portfoliobackend.DAO;

import com.example.portfoliobackend.entity.Role;

public interface RoleDao {
    Role findRoleByName(String theRoleName);
}
