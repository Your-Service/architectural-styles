package com.example.architecturalstyles.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(generator = "uuid4")
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "roles_2_user",
            joinColumns = @JoinColumn (name = "role_id"),
            inverseJoinColumns = @JoinColumn (name = "user_id")
    )
    private Set<User> users;
}
