package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.Book;

public interface IBookService {
    Book getBookById(Long id);
//    List<Book> getAllBooksFromDB();
//    Book saveNewBook();
}
