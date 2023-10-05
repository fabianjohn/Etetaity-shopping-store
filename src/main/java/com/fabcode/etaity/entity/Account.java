package com.fabcode.etaity.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name="account")
public class Account implements Serializable{
	private static final long serialVersionUID = -2054386655979281969L;
	
	public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";
    
    @Column(name="user_name",  nullable = false, length=20)
    private String userName;
    
    @Column(name="email_address", nullable=false, length=20)
    private String emailAddress;
    
    @Column(name="password", nullable= false, length=20)
    private String password;
    
    @Column(name="active", nullable=false, length=20)
    private boolean active;
    
    @Column(name="user_role", nullable=false, length=20)
    private String userRole;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public static String getRoleManager() {
		return ROLE_MANAGER;
	}

	public static String getRoleEmployee() {
		return ROLE_EMPLOYEE;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", emailAddress=" + emailAddress + ", password=" + password
				+ ", active=" + active + ", userRole=" + userRole + "]";
	}
    
    

}
