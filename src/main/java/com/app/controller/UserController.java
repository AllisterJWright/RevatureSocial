package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.User;
import com.app.service.UserService;

@Controller
public class UserController
{
	@Autowired
	UserService userService;
	
	// @CrossOrigin is used to handle the request from a different origin
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/registerUser.app", method=RequestMethod.POST)
	public String registerUser(@RequestParam(name="firstname") String firstname, @RequestParam(name="lastname") String lastname, 
			@RequestParam(name="email") String email, @RequestParam(name="username") String username, @RequestParam("password") String password)
	{
		String defaultPicURL = "";
		User toRegister = new User(username, password, email, firstname + " " + lastname, defaultPicURL);
		userService.insertUser(toRegister);
		return "login";
	}

}
