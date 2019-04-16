package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

import com.models.Posts;
import com.models.User;
import com.services.PostsService;

public class PostsController {
	
	@Autowired
	PostsService PS;
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping(value="/autoAddPosts.rev" )
	public @ResponseBody List<Posts> getAllPosts (){
		return PS.getAllPost();
	} 
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="{user}/autoAddUserPosts.rev")
	public @ResponseBody List<Posts> getUserPost (@PathVariable(value= "user") User user){
		return PS.getUserPost(user);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="{user,post}/autoAddUserPosts.rev")
	public @ResponseBody int insertPost (@PathVariable(value= "user") User user, @PathVariable(value= "post") Posts post) {
		PS.insertPost(post, user);
		return 0;
	}
	

}
