package com.ecommerce1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce1.dto.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{
	
	boolean existsByEmail(String email);
	
	Optional<Admin> findByEmail(String email);

}
