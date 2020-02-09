package com.spring.boot.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping(value="/")
	public String getHome()
	{
		return ("<h1>Welocme To Home</h1>");
	}
	
	@RequestMapping(value="/user")
	public String getUser()
	{
		return ("<h1>Welocme To Home:User</h1>");
	}
	
	@RequestMapping(value="/admin")
	public String getAdmin()
	{
		return ("<h1>Welocme To Home:Admin</h1>");
	}

}
