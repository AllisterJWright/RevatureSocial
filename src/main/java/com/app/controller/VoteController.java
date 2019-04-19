package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.Post;
import com.app.model.User;
import com.app.model.Vote;
import com.app.service.VoteService;

@Controller
public class VoteController {
	
	@Autowired
	VoteService voteService;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="{post, user, rating}/addRating.rev")
	public @ResponseBody int AddRating(@PathVariable(value= "post") Post post, @PathVariable(value= "rating") Vote vote, @PathVariable(value= "user") User user){
		voteService.AddRating(user, post, vote);
		return 0;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="{rating}/deleteRating.rev")
	public @ResponseBody int DeleteRating(@PathVariable(value= "rating") Vote vote){
		voteService.DeleteRating(vote);
		return 0;
	}
	
}