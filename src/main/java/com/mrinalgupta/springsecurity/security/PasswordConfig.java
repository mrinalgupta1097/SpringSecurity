package com.mrinalgupta.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {
    @Bean
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}