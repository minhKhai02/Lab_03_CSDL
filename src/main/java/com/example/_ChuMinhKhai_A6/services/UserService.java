package com.example._ChuMinhKhai_A6.services;

import com.example._ChuMinhKhai_A6.entity.User;
import com.example._ChuMinhKhai_A6.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user){
        userRepository.save(user);
    }
}
