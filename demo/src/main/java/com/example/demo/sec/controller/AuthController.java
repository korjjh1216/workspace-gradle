package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.util.Proxy;
import com.example.demo.uss.domain.UserDto;

@RestController
@RequestMapping("/auth")
//@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class AuthController extends Proxy {
	
	@GetMapping("/signUp")
	public String insertMany() {
		print.accept("-------- �� �� ---------");
		return "1000";
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UserDto user) {
		Map<String, Object> map =new HashMap<>();
		
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
}

