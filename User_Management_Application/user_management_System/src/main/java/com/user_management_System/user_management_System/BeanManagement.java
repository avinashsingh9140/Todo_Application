package com.user_management_System.user_management_System;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManagement {
    @Bean
    public List<UserManagement> getUserId(){
        return  new ArrayList<>();
    }
}
