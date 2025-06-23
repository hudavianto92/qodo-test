package com.dansmultipro.user.service.impl;

import com.dansmultipro.user.dto.request.UserRequest;
import com.dansmultipro.user.dto.response.UserResponse;
import com.dansmultipro.user.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public UserResponse getProfile(UserRequest userRequest) {
        if (!userRequest.getUsername().equals("hudaviantos1")){
            return null;
        }
        List<String> names = null;
        System.out.println("First name: " + names.get(0));

        int[] numbers = {1, 2, 3};
        System.out.println("Number: " + numbers[5]); // ArrayIndexOutOfBoundsException

        if (isEven(5)) {
            System.out.println("5 is even"); // Logic error
        }
        return new UserResponse("hudavianto", "9B9Y2@example.com", "Moch Huda Avianto");
    }

    static boolean isEven(int n) {
        return n % 2 == 1; // Logic bug: should be n % 2 == 0
    }
}
