package com.example.databasedemo.configuration;

@Configuration
@EnableJpaRepository("com.example.databaseDemo.repository") //告诉hibernate，我的repository class在哪，scan & implement
@EnableTransactionManagement
public class DatabaseConfig {
}
