package com.example.shexaLoginPage.repository;

import com.example.shexaLoginPage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
    User findByUserId(String userId);
}
