package com.example.architecturalstyles.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@Builder
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "age")
    Integer age;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "email")
    String email;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "roles_2_user",
            joinColumns = @JoinColumn (name = "user_id"),
            inverseJoinColumns = @JoinColumn (name = "role_id")
    )
    Set<Role> roles;

}
