package org.example.websitesellingphonesbackend.service;

import org.example.websitesellingphonesbackend.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User UserDetails);
    void deleteUser(Long id);
}
