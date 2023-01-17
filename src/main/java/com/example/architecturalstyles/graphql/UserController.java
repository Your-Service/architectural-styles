package com.example.architecturalstyles.graphql;

import com.example.architecturalstyles.entities.User;
import com.example.architecturalstyles.service.IUserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    private final IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

    @QueryMapping
    public User getUser(@Argument String id) {
        return service.getUserById(id);
    }

    @QueryMapping
    public List<User> getListAllUsers() {
        return service.getAllUsersFromDB();
    }

    @MutationMapping
    public User createUser(@Argument User user) {
        return service.saveUser(user);
    }

}
