package com.example.demo.cmm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController{

	@GetMapping("/")
	public String home() {
		System.out.println("====================================");
		System.out.println("============들어왔습니다 헬로============");
		System.out.println("====================================");
		return "Hello React";
	}

}
