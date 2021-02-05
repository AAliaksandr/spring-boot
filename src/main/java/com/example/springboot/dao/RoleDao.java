package com.example.springboot.dao;

import com.example.springboot.model.Role;

public interface RoleDao {
    Role findRoleByRoleName(String role);
}
