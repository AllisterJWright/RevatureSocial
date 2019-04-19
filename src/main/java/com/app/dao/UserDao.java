package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.User;
import com.app.util.HibernateUtil;

public class UserDao
{
	public UserDao() {}

	public void insertUser(User user)
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.save(user);
		tx.commit();
	}

	public User selectUserById(int id)
	{
		Session session = HibernateUtil.getSession();

		return session.get(User.class, id);
	}

	public List<Character> selectAllUsers()
	{
		Session session = HibernateUtil.getSession();

		return session.createQuery("from User").list();
		// createQuery not deprecated; specifies bean, not table
	}
	
	public void updateUser(User user)
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.update(user);
		tx.commit();
	}
	
	public void deleteUser(User user)
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.delete(user);
		tx.commit();
	}

}
