package org.example.firstspringbootapp.dao;

import org.example.firstspringbootapp.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(int id);
    void update(int id, User userUpdate);
    List<User> getAll();
    User getUserById(int id);
}