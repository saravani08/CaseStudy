package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
	@Autowired
	CartDAO cartDAOImpl;
	public void savecart(Cart cart) {
		cartDAOImpl.addCart(cart);
	}
	public Cart findCart(int id) {
		return cartDAOImpl.findCart(id);
	}
	public boolean deleteCart(int id) {
		return cartDAOImpl.deleteCart(id);
	}
	public boolean updateCart(Cart cart) {
		return cartDAOImpl.updateCart(cart);
	}
	public List<Cart> getAllCart(){
		return cartDAOImpl.getAllCart();
	}
	
	
	

}