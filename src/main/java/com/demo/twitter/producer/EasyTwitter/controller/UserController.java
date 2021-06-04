package com.demo.twitter.producer.EasyTwitter.controller;

import com.demo.twitter.producer.EasyTwitter.dto.User;
import com.demo.twitter.producer.EasyTwitter.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return usersRepository.findAll();
    }
}
