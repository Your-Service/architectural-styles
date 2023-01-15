package com.example.architecturalstyles.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
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

    public Book(long l, String title, String s) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Book book = (Book) o;
        return id != null && Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
