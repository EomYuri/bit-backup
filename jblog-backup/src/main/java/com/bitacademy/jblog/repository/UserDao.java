package com.bitacademy.jblog.repository;

import com.bitacademy.jblog.vo.UserVo;

public interface UserDao {
	public int insert(UserVo vo);
	public UserVo selectUser(String id);
	public UserVo selectUser(String id, String password);

}
