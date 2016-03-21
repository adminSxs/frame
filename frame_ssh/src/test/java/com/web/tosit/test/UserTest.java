package com.web.tosit.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.web.tosit.entity.User;
import com.web.tosit.service.UserService;

import antlr.collections.impl.LList;


public class UserTest {
	private static Logger logger = Logger.getLogger(UserTest.class);  
	@Test
	public void test1()
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
	/*	User user = new User();
		user.setUsername("root");
		user.setPassword("root");
		userService.addUser(user);
		*/
		/*User user = userService.qryById(1);*/
		
	/*	user.setUsername("admin");
		user.setPassword("2345254");
		boolean qryByName = userService.qryByName(user);*/
	/*	boolean flag = userService.qryByName(user);
		System.out.println(flag);
	*/
		List<User> list = userService.qurAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
