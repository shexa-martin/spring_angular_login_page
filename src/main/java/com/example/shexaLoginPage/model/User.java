package com.example.shexaLoginPage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="loginuser")
@Entity
public class User {
    @Id
    private String userId;
    private String password;
}
