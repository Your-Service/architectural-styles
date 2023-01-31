package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.Role;
import com.example.architecturalstyles.entities.User;
import com.example.architecturalstyles.repo.RoleRepository;
import com.example.architecturalstyles.repo.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;
import java.util.UUID;

/**
 * TODO что такое Транзакции (ACID) и сессии
 * TODO Что такое хуки?
 */

@Service
public class UserService implements IUserService {

    private final UserRepository repo;
    public final RoleRepository roleRepository;

    public UserService(UserRepository repo, RoleRepository roleRepository) {
        this.repo = repo;
        this.roleRepository = roleRepository;
    }

    @Transactional // TODO: чекнуть как работает аннотация @Transactional
    public User getUserByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Transactional
    public List<User> getAllUsersFromDB() {
        return repo.findAll();
    }

    @Transactional
    public User saveUser(User user) {
        User userFromDB = repo.findByEmail(user.getEmail());

        if (userFromDB != null) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "User with email " + user.getEmail() + " already exist");
        }
        return repo.save(user);
    }

    @Transactional
    public User updateUser(String id, User user) {
        user.setId(UUID.fromString(id));
        return repo.save(user);
    }

    @Transactional
    public void deleteUserById(String id) {
        repo.deleteById(UUID.fromString(id));
    }

}
