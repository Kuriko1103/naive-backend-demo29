package com.example.databasedemo.repository;

import com.example.databasedemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User/*ORM model class*/, Integer/*model class primary key data type*/> {
}
