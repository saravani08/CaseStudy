package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.model.ProductService;
@RestController
public class ProductController {
	
		@Autowired
		ProductService service;
		
		@PostMapping("/addproducts")
		public String addProduct(@RequestBody Product product)
		{
		service.saveProduct(product);
		return "Product Added";
		}
		@PatchMapping("/updateproduct")
		public String updateProduct(@RequestBody Product product)
		{
		if(service.updateProduct(product))
		{
		return "Product updated";
		}
		else
		{
		return "Product not updated";
		}

		}

		@GetMapping("/findproduct/{id}")
		public Product getProduct(@PathVariable("id") int id)
		{
		return service.findProduct(id);
		}

		@GetMapping("/findallproduct")
		public List<Product> getAllProduct()
		{
		return service.getAllProduct();
		}
		@DeleteMapping("/deleteproduct/{id}")
		public String deleteproduct(@PathVariable("id") int id)
		{
		if(service.deleteProduct(id))
		{
		return "product deleted ";
		}
		else
		{
		return "product not deleted";
		}
		}

		
		
		

}