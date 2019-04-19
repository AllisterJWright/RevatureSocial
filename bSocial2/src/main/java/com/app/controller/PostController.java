package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.service.PostService;

@Controller
public class PostController
{
	@Autowired
	PostService postService;
	
	// @CrossOrigin is used to handle the request from a different origin
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/registerUser.app", method=RequestMethod.POST)
	public String submitPost()
	{
		return null;
	}

}
