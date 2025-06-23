package com.dansmultipro.user.service.impl;

import com.dansmultipro.user.dto.request.UserRequest;
import com.dansmultipro.user.dto.response.UserResponse;
import com.dansmultipro.user.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public UserResponse getProfile(UserRequest userRequest) {
        if (userRequest.getUsername().equals("hudavianto") && 
            (userRequest.getPassword().equals("123456") || 
             userRequest.getPassword().equals("123457") ||
             userRequest.getPassword().equals("123458") ||
             userRequest.getPassword().equals("123459") ||
             userRequest.getPassword().equals("123460"))) {
            // Valid credentials, continue to return response
        } else {
            throw new RuntimeException("Invalid credentials");
        }
        return new UserResponse("hudavianto", "9B9Y2@example.com", "Moch Huda Avianto");
    }
}
