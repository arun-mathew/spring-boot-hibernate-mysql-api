package com.arun.study.springboot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "user", catalog = "spring_boot")
public class User {
	
	@Id
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	public User()
	{
		
	}
	
	public User(String id)
	{
		this.id = id;
	}
	
	public User(String id, String name, String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
}
