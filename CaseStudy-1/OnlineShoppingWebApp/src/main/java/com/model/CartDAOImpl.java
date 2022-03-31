package com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CartDAOImpl implements CartDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addCart(Cart cart) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(cart);
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public Cart findCart(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		return session.get(Cart.class,id);
	}

	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("select c from Cart c");
		return query.list();
	}

	@Override
	public boolean updateCart(Cart cart) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(cart);
		session.flush();
		session.getTransaction().commit();
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteCart(int id) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Cart cart=session.get(Cart.class,id);
		session.delete(cart);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

}