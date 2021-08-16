package com.fis.user.bean;

public class User {
	
	String name;
	int id;
	String username;
	String password;
	
	public User() {}
	
	public User(String name,int id,String username,String password) {
		
		
		this.name=name;
		this.id=id;
		this.username=username;
		this.password=password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	

}
