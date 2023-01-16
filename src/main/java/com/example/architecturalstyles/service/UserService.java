package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional(readOnly = true)
public class UserService implements IUserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public User getUserById(String id) {
        return entityManager.find(User.class, UUID.fromString(id));
    }

    @Transactional
    public void saveUser(User user) {
        entityManager.persist(user);
    }

}
