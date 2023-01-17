package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.Role;
import com.example.architecturalstyles.repo.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService{

    private final RoleRepository repo;

    public RoleService(RoleRepository repo) {
        this.repo = repo;
    }

    public Role saveRole(Role role) {
        return repo.save(role);
    }

    public Role getRoleByName(String roleName) {
        return repo.findRoleByName(roleName);
    }

}
