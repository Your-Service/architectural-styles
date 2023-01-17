package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.User;

import java.util.List;

public interface IUserService {
    User getUserById(String id);
    List<User> getAllUsersFromDB();
    User saveUser(User user);
}
