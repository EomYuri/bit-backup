package com.bitacademy.jblog.service;

import com.bitacademy.jblog.vo.UserVo;

public interface UserService {
	
	public boolean join(UserVo vo);
	public UserVo getUser(String id);
	public UserVo getUser(String id, String password);

}
