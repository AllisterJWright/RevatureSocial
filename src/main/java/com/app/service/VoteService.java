package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Post;
import com.app.model.User;
import com.app.model.Vote;
import com.app.repository.VoteDao;

@Service
public class VoteService {

	@Autowired
	VoteDao voteDao;
	
	public int AddRating(User user, Post post, Vote vote) {
		voteDao.insert(vote);
		voteDao.updateOnInsert(user, post);
		return 0;
	}
	
	public int DeleteRating(Vote vote) {
		voteDao.delete(vote);
		return 0;
	}
}