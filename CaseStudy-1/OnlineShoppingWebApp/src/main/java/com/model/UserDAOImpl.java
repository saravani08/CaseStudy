package com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(user);
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public User findUser(String email) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		return session.get(User.class,email);
		
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("select u from User u");
		return query.list();
	}

	@Override
	public boolean updateUser(User user) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(user);
		session.flush();
		session.getTransaction().commit();
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteUser(String email) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		User user=session.get(User.class,email);
		session.delete(user);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

}