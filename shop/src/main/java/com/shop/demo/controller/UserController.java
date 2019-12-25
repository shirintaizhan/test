package com.shop.demo.controller;

import com.shop.demo.model.User;;
import com.shop.demo.repository.UserRepository;
import com.shop.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.lang.String;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public User save(@RequestBody User user){
      return userService.create(user);
    }

    @GetMapping("/{userId}")
    public Optional<User> view (@PathVariable("userId") long userId){
        return userService.findById(userId);
    }

    @PutMapping("/{userId}")
    public User update(@PathVariable("userId") long userId, @RequestBody User user) throws Exception {
        return userService.changeById(userId,user);
    }

    @GetMapping ("/list")
    public List<User> list (){
        return userService.getAll();
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") long userId){
        return userService.deleteById(userId);
    }
}