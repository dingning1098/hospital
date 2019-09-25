package com.dn.hospital.service.Impl;

import com.dn.hospital.dao.UserDao;
import com.dn.hospital.entity.User;
import com.dn.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User get(String username){
		return userDao.get(username);
	};
	@Override
	public void insert(User user){
		userDao.insert(user);
	};
	@Override
	public void delete(String username){
		userDao.delete(username);
	};
	@Override
	public void update(User user){
		userDao.update(user);
	};
}
