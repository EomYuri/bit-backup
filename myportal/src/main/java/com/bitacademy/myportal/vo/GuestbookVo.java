package com.bitacademy.myportal.vo;

import java.util.Date;

public class GuestbookVo {
	// 필드
	private Long no;
	private String name;
	private String password;
	private String content;
	private Date regDate;

	// EJB Bean 규약상 기본생성자는 반드시 있어야한다.
	public GuestbookVo() {
		super();
	}

	// Getters/Setters
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}

}
