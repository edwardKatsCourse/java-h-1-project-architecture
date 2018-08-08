package com.telran.repository;

import com.telran.model.User;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserRepository {
    private static Set<User> users = new HashSet<>();

    public boolean addUser(User user) {
        return users.add(user);
    }

    public Set<User> getUsers() {
        return users;
    }

}
