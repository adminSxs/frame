package com.web.tosit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.tosit.dao.UserDao;
import com.web.tosit.entity.User;
import com.web.tosit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	public boolean qryByName(User user) {
		String hql = "from User where username='"+user.getUsername()+"'";


		User u =userDao.getByName(hql);
		if(u != null)
		{
			if(u.getPassword().equals(user.getPassword()))
				return true;
			else
				return false;
		}
		else
			return false;

	}

	public User qryById(Integer id) {
		return userDao.getById(id);

	}

	public void addUser(User user) {
		userDao.add(user);

	}

	public void deleteUser(User user) {
		userDao.delete(user);

	}

	public void updateUser(User user) {
		userDao.update(user);

	}

	public List<User> qurAll() {
		
		return userDao.findAll("from User");
	}

}
