package com.amakedon.accountservice.service;

import com.amakedon.accountservice.dto.UserDto;
import com.amakedon.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
