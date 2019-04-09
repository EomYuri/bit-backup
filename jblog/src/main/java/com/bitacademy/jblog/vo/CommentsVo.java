package com.bitacademy.jblog.vo;

import java.util.Date;

public class CommentsVo {
	private Long cmtNo;
	private Long postNo;
	private String cmtContent;
	private Date regDate;
	private Long userNo;
	private String userName;
	
	public CommentsVo() {
		super();
	}

	public Long getCmtNo() {
		return cmtNo;
	}

	public void setCmtNo(Long cmtNo) {
		this.cmtNo = cmtNo;
	}

	public Long getPostNo() {
		return postNo;
	}

	public void setPostNo(Long postNo) {
		this.postNo = postNo;
	}

	public String getCmtContent() {
		return cmtContent;
	}

	public void setCmtContent(String cmtContent) {
		this.cmtContent = cmtContent;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Long getUserNo() {
		return userNo;
	}

	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "CommentsVo [cmtNo=" + cmtNo + ", postNo=" + postNo + ", cmtContent=" + cmtContent + ", regDate="
				+ regDate + ", userNo=" + userNo + ", userName=" + userName + "]";
	}

}
