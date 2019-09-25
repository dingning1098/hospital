package com.dn.hospital.service;

import com.dn.hospital.entity.User;

public interface UserService {
	User get(String username);
	void insert(User user);
	void delete(String username);
	void update(User user);
}
