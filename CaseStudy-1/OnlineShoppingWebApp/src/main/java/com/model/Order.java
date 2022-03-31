package com.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="OrderTable")
public class Order {
	@Id
	@GeneratedValue
	private int orderId;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Cart> CartList;
	public Order() 
	{
		
	}
	public List<Cart> getCartList() {
		return CartList;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setCartList(List<Cart> cartList) {
		CartList = cartList;
	}
	

}
