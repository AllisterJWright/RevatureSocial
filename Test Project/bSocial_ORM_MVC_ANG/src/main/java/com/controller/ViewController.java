package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ViewController {

	@RequestMapping(value="/next.app", method = RequestMethod.GET)
	public String getPage() {
		return "page";
	}
}
