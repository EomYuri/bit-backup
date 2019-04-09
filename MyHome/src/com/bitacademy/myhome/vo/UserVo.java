package com.bitacademy.myhome.vo;

import java.util.Date;

public class UserVo {
	// 필드
	private int no;
	private String name;
	private String password;
	private String email;
	private String gender;
	private Date created_at;
	
	// 생성자

	public UserVo(String name, String password, String email, String gender) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
	}
	
	public UserVo(int no, String name, String password, String email, String gender, Date created_at) {
		this(name, password, email, gender);
		this.no = no;
		this.created_at = created_at;
	}
	
	// getter/setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	
	@Override
	public String toString() {
		return "UserVo [no=" + no + ", name=" + name + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", created_at=" + created_at + "]";
	}

	
}