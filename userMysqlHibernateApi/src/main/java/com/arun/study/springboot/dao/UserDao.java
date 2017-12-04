package com.arun.study.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.arun.study.springboot.model.User;

public interface UserDao extends CrudRepository<User, String> {

	Optional<List<User>> findByName(String name);

}
