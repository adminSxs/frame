package com.web.tosit.service;

import java.util.List;

import com.web.tosit.entity.User;



public interface UserService {
	/**
	 * 通过name查询用户
	 * @param user
	 */
	boolean qryByName(User user);
	/**
	 * 通过id查询用户
	 * @param id
	 */
	User qryById(Integer id);
	/**
	 * 通过user对象注册
	 * @param user
	 */
	void addUser(User user);
	/**
	 * 通过id删除一个对象
	 * @param id
	 */
	void deleteUser(User user);
	/**
	 * 更新对象
	 * @param user
	 */
	void updateUser(User user);
	/**
	 * 查询所有的对象
	 * @return
	 */
	List<User> qurAll();
	
}
