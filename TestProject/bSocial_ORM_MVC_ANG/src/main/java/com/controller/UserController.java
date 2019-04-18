package com.controller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.models.User;
import com.services.UserService;

@Controller
@RestController("/bSocial")
public class UserController {

	@Autowired
	UserService US;
	
	@CrossOrigin("http://localhost:4200")
	@RequestMapping(value= "/register.rev", method=RequestMethod.POST)
	public int insertUser(@RequestBody User user) {
		System.out.println(user);
		User NewUser = new User(user.getUsername(),user.getPassword(),user.getEmail(),user.getDisplayName(),user.getDisplayImg());
		System.out.println(NewUser);
		US.register(NewUser);
		return 0;
	}
	
	@CrossOrigin("http://localhost:4200")
	@RequestMapping(value= "/Login.rev", method=RequestMethod.POST)
	public User UpdateUser (@RequestBody String username, String password) {
		User updatedUser = US.Login(username,password);
		return updatedUser;
	}
	
	@CrossOrigin("http://localhost:4200")
	@RequestMapping(value= "/searchUser.rev", method=RequestMethod.GET, params = {"username"})
	public User getUser(String username){
		return US.findPerson(username);
	}
	
	@CrossOrigin("http://localhost:4200")
	@RequestMapping(value= "/updateProfile.rev", method=RequestMethod.POST)
	public User UpdateUser (@RequestBody User user) {
		User updatedUser = US.update(user);
		return updatedUser;
	}
}
