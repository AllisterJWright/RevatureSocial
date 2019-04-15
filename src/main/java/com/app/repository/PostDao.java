package com.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Post;

@Repository("postRepo")
@Transactional
public class PostDao
{
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Autowired
	private SessionFactory sesFact;
	
	public PostDao() {}
	
	public void insertPost(Post post)
	{
		sesFact.getCurrentSession().save(post);
	}
	
	public Post selectPostById(int id)
	{
		return sesFact.getCurrentSession().get(Post.class, id);
	}
	
	public List<Post> selectAllPosts()
	{
		return sesFact.getCurrentSession().createQuery("from Post").list();
	}
	
	public void updatePost(Post post)
	{
		sesFact.getCurrentSession().update(post);
	}
	
	public void deletePost(Post post)
	{
		sesFact.getCurrentSession().delete(post);
	}
}
