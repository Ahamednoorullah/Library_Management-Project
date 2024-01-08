package com.chainsys.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.library.dao.UserRegisterDAO;
import com.chainsys.library.model.UserRegister;

@Controller
public class UserController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	UserRegisterDAO userRegisterdao;
	
	@RequestMapping("/")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/addUser")
	public String addUser(@RequestParam("username") String userName,@RequestParam("email") String email,
			@RequestParam("password") String password,@RequestParam("cpassword") String confirmPassword) {
//		UserRegister userRegister = new UserRegister();
//		userRegister.setUserName(userName);
//		userRegister.setEmail(email);
//		userRegister.setPassword(password);
//		userRegister.setConfirmPassword(confirmPassword);
//		System.out.println(userRegister.getUserName());
		System.out.println("in register page");
		System.out.println(userName);
		userRegisterdao.saveUser(userName,confirmPassword,email,password);
		return "register.html";
	}
}
