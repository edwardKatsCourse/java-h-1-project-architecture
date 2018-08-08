package com.telran.service;

import com.telran.model.User;
import com.telran.repository.UserRepository;

import java.util.Set;


//ОБРАБАТЫВАЕТ (если нужно) И ПЕРЕДАЕТ В Repository
public class UserService {

    private static UserRepository userRepository = new UserRepository();

    public boolean addUser(User user) {
        //User -> UserRepository
        //UserInfo -> UserInfoRepository
        return userRepository.addUser(user);
    }

    public Set<User> getUsers() {
        return userRepository.getUsers();
    }
}
