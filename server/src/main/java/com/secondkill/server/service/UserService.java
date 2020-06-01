package com.secondkill.server.service;

import com.secondKill.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User selectByUsername(String username);

}
