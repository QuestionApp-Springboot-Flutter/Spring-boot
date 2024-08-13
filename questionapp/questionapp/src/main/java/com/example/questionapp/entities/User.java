package com.example.questionapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "User")
@Data
public class User {
    @Id
    private Long id;

    private String userName;

    private String password;
}
