package com.bitacademy.jblog.exception;

import com.bitacademy.jblog.vo.UserVo;

public class UserDaoException extends RuntimeException {
	private UserVo vo = null;

	public UserDaoException() {
		// TODO Auto-generated constructor stub
	}

	public UserDaoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserDaoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public UserDaoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserVo getVo() {
		return vo;
	}

	public void setVo(UserVo vo) {
		this.vo = vo;
	}

}
