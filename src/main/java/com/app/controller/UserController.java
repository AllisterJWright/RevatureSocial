package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.service.UserService;

@Controller
public class UserController
{
	@Autowired
	UserService userService;
	
	// @CrossOrigin is used to handle the request from a different origin
//	@CrossOrigin(origins="http://localhost:4200")
//	@RequestMapping(value="/getemployees", method=RequestMethod.GET)

}
