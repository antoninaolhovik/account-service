package com.amakedon.accountservice.service;

import com.amakedon.accountservice.client.AuthServiceFeignClient;
import com.amakedon.accountservice.dto.UserDto;
import com.amakedon.accountservice.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}
