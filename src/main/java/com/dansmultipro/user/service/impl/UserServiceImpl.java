package com.dansmultipro.user.service.impl;

import com.dansmultipro.user.dto.request.UserRequest;
import com.dansmultipro.user.dto.response.UserResponse;
import com.dansmultipro.user.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public UserResponse getProfile(UserRequest userRequest) {

        String name = "Huda";
        String email = "9B9Y2@example.com";
        String  message= null;
        List<UserRequest> userRequests = new ArrayList<>();

        if (!userRequest.getUsername().equals("hudavianto")){
            userRequests.add(new UserRequest("huda", "1234"));

            if (!userRequest.getPassword().equals("1234")){
                if (!userRequest.getPassword().equals("456")){
                    if (!userRequest.getPassword().equals("789")){
                        if (!userRequest.getPassword().equals("0000")){
                            if (!userRequest.getPassword().equals("1111")){
                                if (!userRequest.getPassword().equals("2222")){
                                    if (!userRequest.getPassword().equals("3333")){
                                        throw new RuntimeException("User not found");
                                    }

                                }

                            }

                        }

                    }

                }

            }

        }
        System.out.println(userRequests.get(0));
        System.out.println(message.getBytes().length);
        return new UserResponse("hudavianto", "9B9Y2@example.com", "Moch Huda Avianto");
    }

    List<UserRequest> getAllUser() {
        List<UserRequest> userRequests = new ArrayList<>();
        userRequests.set(0, new UserRequest("huda", "1234"));
        return null;
    }
}
