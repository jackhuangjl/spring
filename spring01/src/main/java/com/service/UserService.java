package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Imp.UserDaoImp;

@Service
public class UserService {
	@Autowired
	private UserDaoImp userDaoImp;
	
	public void Update(String sql){
		userDaoImp.Updatedata(sql);
	}
	public void Delete(String sql){
		userDaoImp.Deletedata(sql);
	}
	public void Insert(String sql){
		userDaoImp.Insertdata(sql);
	}
	public void Search(String sql){
		userDaoImp.Seletedata(sql);
	}
	@Transactional
	public void test(String sql){
		userDaoImp.Updatedata(sql);
		userDaoImp.Insertdata("insert into mybatis.person values(0,'huangjiayuan','26')");
		int i = 10/0;
	}
}
