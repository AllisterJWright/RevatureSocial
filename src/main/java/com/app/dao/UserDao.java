package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.User;
import com.app.util.HibernateUtil;

public class UserDao
{

	public UserDao() {}

	public void insert(User myUser)
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.save(myUser);
		tx.commit();
	}

	public User selectById(int id)
	{
		Session session = HibernateUtil.getSession();

		return session.get(User.class, id);
	}

	public List<Character> selectAll()
	{
		Session session = HibernateUtil.getSession();

		return session.createQuery("from User").list(); 		
		// createQuery not deprecated; specifies bean, not table
	}

}
