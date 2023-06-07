package com.example._ChuMinhKhai_A6.services;

import com.example._ChuMinhKhai_A6.entity.User;
import com.example._ChuMinhKhai_A6.repository.IRoleRepository;
import com.example._ChuMinhKhai_A6.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user) {
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER").getId();
        if (roleId !=0 && userId !=0){
            userRepository.addRoleToUser(userId,roleId);
        }
    }
}
