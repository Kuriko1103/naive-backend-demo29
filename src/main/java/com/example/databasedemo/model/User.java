package com.example.databasedemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
@Data //getter & setter
public class User {
    @Id //代表primary key
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    private Integer id;

    @Column(name = "name")
    private String name;
}
