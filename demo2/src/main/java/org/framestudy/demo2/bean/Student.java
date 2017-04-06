package org.framestudy.demo2.bean;

public class Student {
	
	private String userName;
	
	private String password;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [userName=" + userName + ", password=" + password + "]";
	}

	
}
