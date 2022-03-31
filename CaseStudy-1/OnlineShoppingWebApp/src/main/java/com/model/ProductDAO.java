package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ProductDAO {
	public void addProduct(Product product);
	public Product findProduct(int id);
	public List<Product> findAllProduct();
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int id);
}
