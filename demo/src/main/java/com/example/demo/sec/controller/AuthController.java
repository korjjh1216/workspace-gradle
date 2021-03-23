package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {
	@GetMapping("/insertMany")
	public Map<String, Object> insertMany() {
		System.out.println("insertMany µé¾î¿È");
		Map<String, Object> map = new HashMap<>();
<<<<<<< HEAD
		
=======
>>>>>>> 58233155e5cea5725b30941c9f03c8ec6e689b44
		map.put("data", "SUCCESS");
		return map;
	}
}

