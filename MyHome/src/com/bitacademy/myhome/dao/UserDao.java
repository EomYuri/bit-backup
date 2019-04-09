package com.bitacademy.myhome.dao;

import java.util.List;

import com.bitacademy.myhome.vo.UserVo;

public interface UserDao {
	// 메서드들 선언
	public List<UserVo> getList();
	public boolean insert(UserVo vo);
	public boolean update(UserVo vo);
	public boolean delete(int no);
	public UserVo getUser(String email, String password);

}
