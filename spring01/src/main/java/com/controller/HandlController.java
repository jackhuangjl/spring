package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.UserService;

@Controller
public class HandlController {
	int i = 1;
	@Autowired
	private UserService userervice;
	@RequestMapping("update")
	public String Update(){
		userervice.test("update mybatis.person set name='wangling' where id=1;");
//		userervice.Update("update mybatis.person set name='jack' where id=1;");
//		if(i==1)
//			throw new RuntimeException(); 
//		userervice.Insert("insert into mybatis.person values(0,'huangjiayuan','26')");
		return "Hello";
	}
	
}
