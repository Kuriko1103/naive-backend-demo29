package com.example.databasedemo.controller;

import com.example.databasedemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    /**
     * 1. 列出所有user的名字
     * 2. HTTP method: GET
     * 3. URL: /names
     * 4. Status code: 200
     * 5. Request header: xx
     * 6. Request body: None
     * 7. Response body: List<String>
     */
    @GetMapping(path = "/names")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<String> getAllNames() {
        return userService.getAllNames();
    }
}
