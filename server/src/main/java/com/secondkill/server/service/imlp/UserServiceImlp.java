package com.secondkill.server.service.imlp;

import com.secondKill.entity.User;
import java.util.List;

import com.secondKill.mapper.UserMapper;
import com.secondkill.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImlp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUserName(username);
    }
}
