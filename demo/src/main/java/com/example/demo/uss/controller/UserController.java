package com.example.demo.uss.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.uss.domain.UserDto;

@Controller
public class UserController {
	@Autowired UserDto user;
	
	public void test() {
		String a = user.getPassword();
	}
=======
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	
>>>>>>> 58233155e5cea5725b30941c9f03c8ec6e689b44
}
