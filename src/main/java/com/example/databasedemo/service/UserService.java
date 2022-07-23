package com.example.databasedemo.service;

import com.example.databasedemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<String> getAllNames() {
        List<User> users =  userRepository.findAll();
        List<String> nameList = new ArrayList<>();
        for (User user: users) {
            nameList.add(user.getName());
        }
        return nameList;
    }
}
