package com.ecommerce1.service;

import java.util.Optional;

import org.hibernate.boot.internal.DefaultSessionFactoryBuilderService;
import org.springframework.stereotype.Service;

import com.ecommerce1.dto.User;
import com.ecommerce1.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;
	
	public UserServiceImpl(UserRepository repository) {
		this.repository=repository;
	}

	@Override
	public User signUp(User user) {
		if(repository.existsByEmail(user.getEmail())) {
			throw new RuntimeException("Email already exist");
		}
		return repository.save(user);
	}

	@Override
	public String signin(String email, String password) {
		
		Optional<User> optionalUser=repository.findByEmail(email);
		
		if(optionalUser.isEmpty()) {
			return "User not found";
		}
		
		User dbUser=optionalUser.get();
		
		if(!dbUser.getPassword().equals(password)) {
			return "Invalid User";
		}
				
		return "Login Successful";
	}
	
	

	
}
