package com.chainsys.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chainsys.library.model.UserRegister;

@Repository
public class UserRegisterDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void saveUser(String userName,String email,String password,String confirmPassword) {
		String query = "insert into registration(user_name,cnfpassword,email,password) values (?,?,?,?)";
	    System.out.println(email);
		Object[] params = {userName,confirmPassword,email,password};
		//System.out.println(params);
		jdbcTemplate.update(query, params);
	}
	
}
