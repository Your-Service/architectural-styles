package com.example.architecturalstyles.api;

import com.example.architecturalstyles.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class UserController {

    private final IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

}
