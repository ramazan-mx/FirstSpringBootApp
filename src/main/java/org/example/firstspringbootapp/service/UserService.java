package org.example.firstspringbootapp.service;


import org.example.firstspringbootapp.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(int id, User user);
    void delete(int id);
    List<User> getAll();
    User getUserById(int id);
}
