package com.example._ChuMinhKhai_A6.Validator;

import com.example._ChuMinhKhai_A6.Validator.annotation.ValidUsername;
import com.example._ChuMinhKhai_A6.repository.IUserRepository;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername,String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context)
    {
        if(userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }

}