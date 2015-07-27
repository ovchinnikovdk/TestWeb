package com.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.TestWeb;

@Transactional
@Repository
public class TestWebManager {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<TestWeb>getAll(){
		return this.sessionFactory.getCurrentSession().createCriteria(TestWeb.class).list();
	}
	
	public void addNew(TestWeb test){
		this.sessionFactory.getCurrentSession().save(test);
	}
}
