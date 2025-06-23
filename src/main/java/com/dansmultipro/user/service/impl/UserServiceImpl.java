package com.dansmultipro.user.service.impl;

import com.dansmultipro.user.dto.request.UserRequest;
import com.dansmultipro.user.dto.response.UserResponse;
import com.dansmultipro.user.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public UserResponse getProfile(UserRequest userRequest) {
        if (!userRequest.getUsername().equals("hudavianto")){
            if (!userRequest.getPassword().equals("123456")){
                if (!userRequest.getPassword().equals("123457")){
                    if (!userRequest.getPassword().equals("123458")){
                        if (!userRequest.getPassword().equals("123459")){
                            if (!userRequest.getPassword().equals("123460")){
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }

        }
        return new UserResponse("hudavianto", "9B9Y2@example.com", "Moch Huda Avianto");
    }
}
