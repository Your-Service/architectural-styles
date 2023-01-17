package com.example.architecturalstyles.graphql;

import com.example.architecturalstyles.entities.Role;
import com.example.architecturalstyles.entities.User;
import com.example.architecturalstyles.service.IRoleService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {

    private final IRoleService service;

    public RoleController(IRoleService service) {
        this.service = service;
    }

    @QueryMapping
    public Role getRoleByName(@Argument String name) {
        return service.getRoleByName(name);
    }

    @MutationMapping
    public Role createRole(@Argument Role role) {
        return service.saveRole(role);
    }

}
