package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.User;

import java.util.List;

public interface IUserService {
    User getUserByEmail(String email);
    List<User> getAllUsersFromDB();
    User saveUser(User user) throws Exception;
    User updateUser(String id, User user);
    void deleteUserById(String id);
}
