package com.example.Ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecommerce.model.CartItem;
import com.example.Ecommerce.service.CartItemService;

 

@RestController
public class CartItemController {

	 
	@Autowired
	CartItemService cartitemservice ;


	@PostMapping("/additem")
    public CartItem addToCart(@RequestBody CartItem cart) {
        return  cartitemservice.addToCart(cart);
    }


	 
} 

 
