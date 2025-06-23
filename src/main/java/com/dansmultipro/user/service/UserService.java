package com.dansmultipro.user.service;

import com.dansmultipro.user.dto.request.UserRequest;
import com.dansmultipro.user.dto.response.UserResponse;

public interface UserService {

    UserResponse getProfile(UserRequest userRequest);
}
