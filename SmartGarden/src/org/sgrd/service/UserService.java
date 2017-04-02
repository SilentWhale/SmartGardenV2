package org.sgrd.service;

import java.util.List;

import org.sgrd.domain.User;

public interface UserService{
	User login(String userName,String userPwd);
	void save(User user);
	List<User> listUsers();
	void deleteUser(Integer userId);
	User pickUser(Integer userId);
	void updateUser(User user);
}

