package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setFirstName("First Name");
        return user;
    }
}
