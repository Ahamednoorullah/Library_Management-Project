package com.chainsys.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.library.dao.UserRegisterDAO;

@Controller
public class UserController {

//	@Autowired
//	JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	UserRegisterDAO userRegisterdao;
	
	@RequestMapping("/")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/addUser")
	public String addUser() {
		System.out.println("in register page");
		return "register.html";
	}
}
