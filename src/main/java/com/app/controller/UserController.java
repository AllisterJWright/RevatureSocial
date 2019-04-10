package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.UserService;

@RestController
public class UserController
{
	@Autowired
	UserService userService;
	
	// @CrossOrigin is used to handle the request from a different origin
//	@CrossOrigin(origins="http://localhost:4200")
//	@RequestMapping(value="/getemployees", method=RequestMethod.GET)

}
