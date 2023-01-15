package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserService implements IUserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserById(String id) {
        User user = new User();
        user.setFirstName("Vasya");
        user.setLastName("Ivanov");
        return user;
    }

    @Transactional
    public void saveUser(User user) {
        entityManager.persist(user);
    }


}
