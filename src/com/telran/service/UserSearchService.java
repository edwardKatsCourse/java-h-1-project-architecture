package com.telran.service;

import com.telran.model.User;
import com.telran.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

public class UserSearchService {

    static UserRepository userRepository = new UserRepository();

    public Set<User> allUsers() {
        return userRepository.getUsers();
    }

    public User findByEmail(String email) {
        Set<User> users = userRepository.getUsers();

        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }

    public Set<User> findByLastName(String lastName) {
        Set<User> users = userRepository.getUsers();

        Set<User> usersFound = new HashSet<>();

        for (User user: users) {
            if (user.getLastName().equalsIgnoreCase(lastName)) {
                usersFound.add(user);
            }
        }

        return usersFound;
    }


}
