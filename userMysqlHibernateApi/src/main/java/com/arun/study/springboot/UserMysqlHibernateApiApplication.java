package com.arun.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class UserMysqlHibernateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMysqlHibernateApiApplication.class, args);
	}
}
