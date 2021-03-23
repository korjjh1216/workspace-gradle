package com.example.demo.cmm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController{
<<<<<<< HEAD

=======
	
>>>>>>> 58233155e5cea5725b30941c9f03c8ec6e689b44
	@GetMapping("/")
	public String home() {
		System.out.println("====================================");
		System.out.println("============들어왔습니다 헬로============");
		System.out.println("====================================");
		return "Hello React";
	}
<<<<<<< HEAD

=======
	
>>>>>>> 58233155e5cea5725b30941c9f03c8ec6e689b44
}
