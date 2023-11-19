package com.example.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.service.ProductService;

 

@RestController
public class ProductController {
	@Autowired
	ProductService productservice;

	@PostMapping("/productinsert")
	public Product Padd(@RequestBody Product p) {
		return productservice.add(p);
	}

	@GetMapping("/productfilter")
	public List<Product> Pget(@RequestParam String category) {
		return productservice.filter(category);
	}

	@GetMapping("/Display")
	public List<Product> Pdisplay() {
		return productservice.display();
	}
	
	@GetMapping("/Sorting/{field}")
	public List<Product> psort(@PathVariable String field)
	{
		return productservice.sort(field);
	}

}
