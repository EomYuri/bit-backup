package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.exception.UserDaoException;
import com.bitacademy.jblog.repository.UserDao;
import com.bitacademy.jblog.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDaoImpl;
	
	@Override
	public boolean join(UserVo vo) throws UserDaoException {
		// TODO Auto-generated method stub
		int insertedCount = userDaoImpl.insert(vo);
		System.out.println(insertedCount);
		return 1 == insertedCount;
	}

	@Override
	public UserVo getUser(String id) {
		return userDaoImpl.selectUser(id);
	}

	@Override
	public UserVo getUser(String id, String password) {
		return userDaoImpl.selectUser(id, password);
	}
}

