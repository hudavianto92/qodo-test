package com.dansmultipro.user.controller;

import com.dansmultipro.user.dto.request.UserRequest;
import com.dansmultipro.user.dto.response.UserResponse;
import com.dansmultipro.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/profile")
    public UserResponse profile(@RequestBody UserRequest userRequest) {
        return userService.getProfile(userRequest);
    }
}
