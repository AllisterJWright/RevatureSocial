package com.app.service;

import java.util.List;

import com.app.dao.PostDao;
import com.app.model.Post;

public class PostService
{
	PostDao postDao = new PostDao();
	
	public  void insertPost(Post post)
	{
		postDao.insertPost(post);
	}
	
	public Post selectPostById(int id)
	{
		return postDao.selectPostById(id);
	}
	
	public List<Post> selectAllPosts()
	{
		return postDao.selectAllPosts();
	}
	
	public void updatePost(Post post)
	{
		postDao.updatePost(post);
	}
}
