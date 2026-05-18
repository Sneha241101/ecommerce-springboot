package com.ecommerce1.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce1.dto.User;
import com.ecommerce1.dto.UserLogin;
import com.ecommerce1.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	private final UserService service;

	public UserController(UserService service) {
		this.service=service;
		
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return service.signUp(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody UserLogin userLogin) {

	    return service.signin(
	            userLogin.getEmail(),
	            userLogin.getPassword());
	}

}
