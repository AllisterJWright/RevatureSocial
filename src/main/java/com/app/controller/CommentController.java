package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.Comment;
import com.app.model.Post;
import com.app.model.User;
import com.app.service.CommentService;

@Controller
public class CommentController
{
	@Autowired
	CommentService commentService;
	
	//HAVE TO CHANGE TO YOUR PORT NUMBER
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="{post, comment, user}/addComment.rev")
	public @ResponseBody int AddComment(@PathVariable("post") Post post, @PathVariable(value= "comment") Comment comment, @PathVariable("user") User user){
		commentService.AddComment(user, post, comment);
		commentService.getAllComments(post);
		return 0;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="{post}/autoAddComments.rev")
	public @ResponseBody List<Comment> getAllComments(@PathVariable(value= "post") Post post){
		return commentService.getAllComments(post);
	}

}
