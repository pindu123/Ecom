package com.example.Ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.ProductRepository;

 

@Service

public class ProductService {
	@Autowired 
ProductRepository productrepository; 
	public Product add(Product p)
	{
	  return productrepository.save(p);	
	}
    
	public List<Product> filter(String category)
	{
	    
	    return productrepository.findAllByCategory(category);
 
	}
	
	public List<Product> display()
	{
		return productrepository.findAll();
	}
	
	public List<Product> sort(String field)
	{
		return productrepository.findAll(Sort.by(Sort.Direction.ASC, field));
	}
}
