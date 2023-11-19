package com.example.Ecommerce.repository;

import java.util.List;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Ecommerce.model.Product;
 

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findAllByCategory(String category);
	public Product findById(int id);
 

	 

}
