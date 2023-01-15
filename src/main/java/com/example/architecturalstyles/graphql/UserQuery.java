package com.example.architecturalstyles.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.architecturalstyles.entities.User;
import com.example.architecturalstyles.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserQuery implements GraphQLQueryResolver {

    private final IUserService service;

    public UserQuery(IUserService service) {
        this.service = service;
    }

    public User getUser() {
        return service.getUserById(123L);
    }

}
