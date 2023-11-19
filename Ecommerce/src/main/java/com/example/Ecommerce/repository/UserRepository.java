package com.example.Ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecommerce.model.User;

 

 

public interface UserRepository extends JpaRepository< User, Integer> {
 
	User findByEmail(String email);
	 

	User findByEmailAndPassword(String email, String password);

}
