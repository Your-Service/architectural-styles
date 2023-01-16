package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.User;

public interface IUserService {
    User getUserById(String id);
    void saveUser(User user);
}
