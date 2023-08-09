package com.flight.FlightBookingSystem.model;

public class Admin {
	
	private Integer adminId;
	private String adminName;
	private String username;
	private String password;
	
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
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
	public Admin(Integer adminId, String adminName, String username, String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", username=" + username + ", password="
				+ password + "]";
	}
	public Admin loginAdmin(String username2, String password2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}
