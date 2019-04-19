package com.app.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Comment;
import com.app.model.Post;
import com.app.model.User;

@Repository
@Transactional
public class CommentDao
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
	
	public CommentDao() {}
	
	public int insert(Comment comment) { //not mapped to post or user just yet
		sesFact.getCurrentSession().save(comment);
		return 0;
	}
	
	public List<Comment> selectCommentsByPost(Post post) {
		List<Comment> comments = sesFact.getCurrentSession().createQuery("from Comments where Post_ID= " + post.getPostId(), Comment.class).list();
		return comments;
	}
	
	public int updateCommentWithInfo(User user, Post post, Comment comment) {
		sesFact.getCurrentSession().createQuery("update Comments set username =" + user.getUsername() + ",Post_ID= " + post.getPostId() + "where Comment_ID= " + comment.getCommentId());
		return 0;
	}
}
