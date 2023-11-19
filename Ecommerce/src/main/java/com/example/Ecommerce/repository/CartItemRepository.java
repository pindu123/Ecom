package com.example.Ecommerce.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Ecommerce.model.CartItem;

 

@Repository
public interface  CartItemRepository extends JpaRepository<CartItem,Integer >{
	public Optional<CartItem> findById(int id);

}
