package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.Role;

public interface IRoleService {
    Role saveRole(Role role);
    Role getRoleByName(String roleName);
}
