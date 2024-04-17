package org.example.websitesellingphonesbackend.service.Impl;

import org.example.websitesellingphonesbackend.entities.User;
import org.example.websitesellingphonesbackend.exception.ResourceNotFoundException;
import org.example.websitesellingphonesbackend.repositories.UserRepository;
import org.example.websitesellingphonesbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository employeeRepository){
        this.userRepository = employeeRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));

        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setEmail (userDetails.getEmail());

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User employee = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));

        userRepository.delete(employee);

    }
}
