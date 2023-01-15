package com.example.architecturalstyles.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.architecturalstyles.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserQuery implements GraphQLQueryResolver {

    private final IUserService service;

    public UserQuery(IUserService service) {
        this.service = service;
    }

    public Book getBook() {
        return service.getBookById(123L);
    }

}
