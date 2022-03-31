package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderDAO orderDAOImpl;
	public void saveOrder(Order order) {
		orderDAOImpl.addOrder(order);
	}
	public Order findOrder(int id) {
		return orderDAOImpl.findOrder(id);
	}
	public boolean deleteOrder(int id) {
		return orderDAOImpl.deleteOrder(id);
	}
	public boolean updateOrder(Order order) {
		return orderDAOImpl.updateOrder(order);
	}
	public List<Order> getAllOrder(){
		return orderDAOImpl.findAllOrder();
	}
	
	
	

}