package com.example.demo.uss.service;

import com.example.demo.uss.repository.UserRepositoryImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class UserServiceImpl  implements UserService {
    private final UserRepositoryImpl repo;
    
	
	
}
