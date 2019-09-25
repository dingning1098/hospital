package com.dn.hospital.service.Impl;

import com.dn.hospital.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {
	private ApplicationContext context;
	@Before
	public void before(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");

	}

	@Test
	public void get() {
		UserDao userDao = (UserDao)context.getBean("userDao");
		System.out.println(userDao.get("dingning"));
	}

	@Test
	public void insert() {
	}

	@Test
	public void delete() {
	}

	@Test
	public void update() {
	}
}