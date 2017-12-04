package com.arun.study.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.arun.study.springboot.dao.UserDao;
import com.arun.study.springboot.model.User;

@Service
@ComponentScan("userService")
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public List<User> getAllUsers()
	{
		List<User> users = new ArrayList<>();
		userDao.findAll()
		       .forEach(users::add);
		return users;
		
	}
	
	public User getUser(String id)
	{
		return userDao.findOne(id);
	}
	
	public void deleteUser(String id)
	{
		userDao.delete(id);
	}
	
	public void updateUser(User user)
	{
		userDao.save(user);
	}
	
	public void addUser(User user)
	{
		userDao.save(user);
	}

	public Optional<List<User>> findByName(String name) {
		
		return userDao.findByName(name);
	}

}
