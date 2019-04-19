package com.app.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Post;
import com.app.model.User;
import com.app.model.Vote;

@Repository
@Transactional
public class VoteDao
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
	
	public VoteDao() {}
	
	public int insert(Vote vote) {
		sesFact.getCurrentSession().save(vote);
		return 0;
	}
	
	public int updateOnInsert(User user, Post post) {
		sesFact.getCurrentSession().createQuery("update Ratings set username= " + user.getUsername() + "set Post_ID= " + post.getPostId());
		return 0;
	}
	
	public int delete(Vote vote) {
		sesFact.getCurrentSession().delete(vote);
		return 0;
	}

}
