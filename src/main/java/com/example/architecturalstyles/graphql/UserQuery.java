package com.example.architecturalstyles.graphql;

import com.example.architecturalstyles.entities.User;
import com.example.architecturalstyles.service.IUserService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserQuery {

    private final IUserService service;

    public UserQuery(IUserService service) {
        this.service = service;
    }

    @QueryMapping
    public User getUser() {
        return service.getUserById(123L);
    }
}
