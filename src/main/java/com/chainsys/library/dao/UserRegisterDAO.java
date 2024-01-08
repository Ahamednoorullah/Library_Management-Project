package com.chainsys.library.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chainsys.library.model.UserRegister;

@Repository
public class UserRegisterDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void saveUser(String userName) {
		//String query = "insert into registration(user_name,cnfpassword,email,password) values (?,?,?,?)";
		String query = "insert into bookstore.book(user) values ('"+userName+"')";
		System.out.println(query);
//		System.out.println(email);
//	    System.out.println(password);
//	    System.out.println(confirmPassword);
		//Object[] params = {userName,confirmPassword,email,password};
		//System.out.println(params);
		try {
			System.out.println(jdbcTemplate.getDataSource().getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jdbcTemplate.update(query);
	}
	
}
