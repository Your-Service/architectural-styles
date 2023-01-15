package com.example.architecturalstyles.api;

import com.example.architecturalstyles.entities.User;
import com.example.architecturalstyles.service.IUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return service.getUserById(id);
    }

    @PostMapping("/")
    public void createUser(@RequestBody() User user) {
        service.saveUser(user);
    }
}
