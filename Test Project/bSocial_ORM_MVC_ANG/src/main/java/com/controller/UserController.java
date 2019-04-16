package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.models.User;
import com.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService US;
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping(value= "{user}/register.rev")
	public @ResponseBody int insertUser(@PathVariable(value = "user") User user) {
		US.register(user);
		return 0;
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping(value= "/searchUser.rev/{user}")
	public @ResponseBody User findUser(@PathVariable(value = "user") User user) {
		User foundUser = US.findPerson(user);
		return foundUser;
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping(value= "/updateProfile.rev/{user}")
	public @ResponseBody User UpdateUser (@PathVariable(value = "user") User user) {
		User updatedUser = US.update(user);
		return updatedUser;
	}
}
