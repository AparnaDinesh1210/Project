package com.fujitsu.loginAndRegister.model;

public class User {
	
	int id;
	String username;
	String password;
	int phone;
	String Address;
	public User(int id, String username, String password, int phone, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		Address = address;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", Address=" + Address + "]";
	}
	
	

}
