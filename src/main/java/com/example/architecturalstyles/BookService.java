package com.example.architecturalstyles;

import com.example.architecturalstyles.entities.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public Book getBook() {
        Book book = new Book(123L, "title", "s");
        return book;
    }
}
