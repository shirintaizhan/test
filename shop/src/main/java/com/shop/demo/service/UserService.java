package com.shop.demo.service;

import com.shop.demo.model.User;
import com.shop.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public User create (User user){
        return userRepository.save(user);
    }

    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

    public String deleteById(long id) {
        userRepository.findById(id);
        return "User number:" + id + "has been deleted!";
    }

    public User changeById(long id, User user) throws Exception {
        return userRepository.findById(id)
                .map(user1 -> {
                    user1.setUserId(user.getUserId());
                    user1.setEmail(user.getEmail());
                    user1.setPassword(user.getPassword());
                    user1.setActive(user.getActive());
                    user1.setRoles(user.getRoles());
                    return userRepository.save(user1);
                }).orElseThrow(Exception::new);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
