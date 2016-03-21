package com.web.tosit.base;

import java.util.List;

public interface BaseDao<T> {
	
	/**
	 * 使用get得到对象
	 * @param id
	 * @return
	 */
	T getById(Integer id);
	
	/**
	 * 使用load得到对象
	 * @param id
	 * @return
	 */
	T loadById(Integer id);
	/**
	 * 使用get通过name获得对象
	 * @param hql
	 * @return
	 */
	T getByName(String hql);
	
	/**
	 * 得到所有的对象
	 * @param sql
	 * @return
	 */
	List<T> findAll(String sql);
	
	/**
	 * 通过对象持久化数据
	 * @param entity
	 */
	void add(T entity);
	/**
	 * 通过对象持久化数据
	 * @param hql
	 */
	void add(String hql);
	
	/**
	 * 通过对象删除记录
	 * @param entity
	 */
	void delete(T entity);
	
	/**
	 * 通过hql删除记录
	 * @param hql
	 */
	void delete(String hql);
	/**
	 * 通过对象更新记录
	 * @param entity
	 */
	void update(T entity);
	/**
	 * 通过hql更新记录
	 * @param hql
	 */
	void update(String hql);
}
