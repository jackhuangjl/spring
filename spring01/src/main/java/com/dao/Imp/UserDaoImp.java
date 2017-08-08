package com.dao.Imp;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dao.UserDao;

@Component
public class UserDaoImp implements UserDao {
	
	@Autowired
	private JdbcTemplate userJdbcTemplate;
	 
	public void Seletedata(String sql) {
		// TODO Auto-generated method stub
		userJdbcTemplate.execute(sql);
	}

	public void Insertdata(String sql) {
		// TODO Auto-generated method stub
		userJdbcTemplate.execute(sql);
	}

	public void Updatedata(String sql) {
		// TODO Auto-generated method stub
		System.out.println(sql);
		if(userJdbcTemplate == null){
			System.out.println("userJdbcTemplate is null point");
		}
		userJdbcTemplate.update(sql);
//		userJdbcTemplate.execute(sql);
	}

	public void Deletedata(String sql) {
		// TODO Auto-generated method stub
		userJdbcTemplate.execute(sql);
	}

}
