package com.web.tosit.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.tosit.entity.User;

public class BaseDaoImpl<T> implements BaseDao<T> {

	@Autowired
	private SessionFactory sessionFactory;
	private Class clazz;
	
	public BaseDaoImpl() {
		Type type = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType)type).getActualTypeArguments();
		clazz=(Class) params[0];
		}
	
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	public T getById(Integer id) {
		
		return (T) getSession().get(clazz, id);
	}

	public T loadById(Integer id) {
	
		return (T) getSession().load(clazz, id);
	}

	public T getByName(String hql) {
		
		List list = getSession().createQuery(hql).list();
		T entity = (T) list.get(0);
		
		return entity;
	}

	
	public List<T> findAll(String hql) {
		
		return  (List<T>) getSession().createQuery(hql).list();
	}

	public void add(T entity) {
		getSession().save(entity);
		
	}

	public void add(String hql) {
	
		
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}

	public void delete(String hql) {
		// TODO Auto-generated method stub
		
	}

	public void update(T entity) {
		getSession().saveOrUpdate(entity);
		
	}

	public void update(String hql) {
		
		
	}

}
