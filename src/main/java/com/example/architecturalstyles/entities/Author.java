package com.example.architecturalstyles.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "authors")
public class Author {

    @Id
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "language")
    private String language;

    @Column(name = "country")
    private String country;

    @Column(name = "birth_year")
    private int birthYear;

}
