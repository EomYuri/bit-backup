package com.bitacademy.jblog.vo;

import java.util.Date;

public class PostVo {

	private Long postNo;
	private Long cateNo;
	private String postTitle;
	private String postConetnt;
	private Date regDate;
	public PostVo() {
		super();
	}
	public Long getPostNo() {
		return postNo;
	}
	public void setPostNo(Long postNo) {
		this.postNo = postNo;
	}
	public Long getCateNo() {
		return cateNo;
	}
	public void setCateNo(Long cateNo) {
		this.cateNo = cateNo;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostConetnt() {
		return postConetnt;
	}
	public void setPostConetnt(String postConetnt) {
		this.postConetnt = postConetnt;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "PostVo [postNo=" + postNo + ", cateNo=" + cateNo + ", postTitle=" + postTitle + ", postConetnt="
				+ postConetnt + ", regDate=" + regDate + "]";
	}

}
