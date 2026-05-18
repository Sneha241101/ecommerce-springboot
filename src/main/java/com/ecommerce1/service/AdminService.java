package com.ecommerce1.service;

import com.ecommerce1.dto.Admin;

public interface AdminService {

	Admin register(Admin admin);
	
	String login(String email, String password);
}
