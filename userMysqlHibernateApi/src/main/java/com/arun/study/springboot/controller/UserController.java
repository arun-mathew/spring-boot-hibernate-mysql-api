package com.arun.study.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arun.study.springboot.model.User;
import com.arun.study.springboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
	@RequestMapping(method = RequestMethod.GET, value ="/user/{name}")
	public List<User> getUserByName(@PathVariable String name)
	{
		Optional<List<User>> optionalList = userService.findByName(name);
		List<User> userList;
		
		userList = optionalList.orElse(new ArrayList<User>());
		
		if(optionalList.isPresent()) {
			userList = optionalList.get();
		}
		return userList;
	}

}
