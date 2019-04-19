package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Comment;
import com.app.model.Post;
import com.app.model.User;
import com.app.repository.CommentDao;

@Service
public class CommentService
{
	@Autowired
	CommentDao commentDao;
	
	public List<Comment> getAllComments(Post post) {
		return commentDao.selectCommentsByPost(post);
	}
	
	public int AddComment(User user, Post post, Comment comment) {
		commentDao.insert(comment);
		commentDao.updateCommentWithInfo(user, post, comment);
		return 0;
	}

}
