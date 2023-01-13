package com.example.architecturalstyles.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "original_language")
    private String originalLanguage;

    @Column(name = "language")
    private String language;

    @Column(name = "genre")
    private String genre;

    @Column(name = "pages")
    private int pages;

    @Column(name = "author_id")
    private Long authorId;

}
