package com.example.architecturalstyles.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.architecturalstyles.entities.Book;
import com.example.architecturalstyles.service.IBookService;
import org.springframework.stereotype.Component;

@Component
public class BookQuery implements GraphQLQueryResolver {

    private final IBookService service;

    public BookQuery(IBookService service) {
        this.service = service;
    }

    public Book getBook() {
        return service.getBookById(123L);
    }

}
