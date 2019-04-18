package com.daoRepository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.models.Posts;
import com.models.User;

@Repository("PostsDaoRepo")
@Transactional
@EnableTransactionManagement
public class PostsDaoRepo {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Autowired
	private SessionFactory SF;
	
	public PostsDaoRepo() {
		
	}
	
	public int insert(Posts post) {
		SF.getCurrentSession().save(post);
		return 0;
	}
	
	public int updatePost (Posts post, User user) {
		SF.getCurrentSession().createQuery("update Posts set username= " + user.getUsername());
		return 0;
	}
	
	public List<Posts> getPostByUser (User user) {
		List<Posts> posts = SF.getCurrentSession().createQuery("from Posts where username=" + user, Posts.class).list();
		return posts;
	}
	
	public List<Posts> getAllPost () {
		List<Posts> posts = SF.getCurrentSession().createQuery("from Posts", Posts.class).list();
		return posts;
	}

}
