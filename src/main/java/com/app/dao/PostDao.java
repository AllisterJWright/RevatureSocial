package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Post;
import com.app.util.HibernateUtil;

public class PostDao
{
	public PostDao() {}
	
	public void insertPost(Post post)
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.save(post);
		tx.commit();
	}
	
	public Post selectPostById(int id)
	{
		Session session = HibernateUtil.getSession();

		return session.get(Post.class, id);
	}
	
	public List<Post> selectAllPosts()
	{
		Session session = HibernateUtil.getSession();

		return session.createQuery("from Post").list();
	}
	
	public void updatePost(Post post)
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.update(post);
		tx.commit();
	}
	
	public void deletePost(Post post)
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.delete(post);
		tx.commit();
	}
}
