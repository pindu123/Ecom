package com.example.Ecommerce.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecommerce.model.CartItem;
import com.example.Ecommerce.repository.CartItemRepository;
 

@Service
public class CartItemService {

	@Autowired
	private CartItemRepository cartItemRepository;
	public CartItem addToCart(CartItem cart) {
        return cartItemRepository.save(cart);
    }

	 
 
}