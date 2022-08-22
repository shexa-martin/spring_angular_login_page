package com.example.shexaLoginPage.controller;

import com.example.shexaLoginPage.model.User;
import com.example.shexaLoginPage.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User userData){
        User user = userRepo.findByUserId(userData.getUserId());
        if(user.getPassword().equals(userData.getPassword())){
            return ResponseEntity.ok(user);
        }
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }
}
