package com.ecommerce1.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce1.dto.Admin;
import com.ecommerce1.dto.UserLogin;
import com.ecommerce1.service.AdminService;


@RestController
@RequestMapping("/api/admins")
public class AdminController {

	private final AdminService service;

	public AdminController(AdminService service) {
		this.service=service;
		
	}
	
	
	@PostMapping("/register")
	public Admin register(@RequestBody Admin admin) {
		return service.register(admin);
		
	}
	
	@PostMapping("/login")
	public String login(@RequestBody UserLogin userLogin) {
		return service.login(userLogin.getEmail(),
	            userLogin.getPassword());
	}



	
	
}
