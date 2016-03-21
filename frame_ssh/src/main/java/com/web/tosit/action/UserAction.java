package com.web.tosit.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.web.tosit.entity.User;
import com.web.tosit.service.UserService;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	@Autowired
	private UserService userService;
	
	public String login()
	{
		
		if(userService.qryByName(user))
		return "success";
		else
			return "fail";
	}

	
	
	
	public User getModel() {
		return user;
	}
}
