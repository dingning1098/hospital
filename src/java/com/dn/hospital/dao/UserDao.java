package com.dn.hospital.dao;

import com.dn.hospital.entity.User;

public interface UserDao {
	User get(String username);
	void insert(User user);
	void delete(String username);
	void update(User user);
}
