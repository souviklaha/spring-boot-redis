package com.springbootredisexample.example;

import com.springbootredisexample.example.model.User;

import java.util.Map;

public interface UserRepository {

    public void save(User user);
    public Map<String, User> findAll();
    public User findById(String id);
    public void update(User user);
    public void delete(String id);
}
