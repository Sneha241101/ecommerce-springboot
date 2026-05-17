package com.ecommerce1.service;

import com.ecommerce1.dto.User;

public interface UserService {
	
	User signUp(User user);
	
	String signin(String email, String password);

}
