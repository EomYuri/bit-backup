package com.bitacademy.jblog.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.exception.UserDaoException;
import com.bitacademy.jblog.vo.UserVo;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public int insert(UserVo vo) throws UserDaoException {
		int insertedCount = 0;
		try {
			insertedCount = sqlSession.insert("users.insert",vo);
		}catch(Exception e) {
			System.err.println("DAO:ERROR:"+e.getMessage());
			UserDaoException ex = new UserDaoException("회원 가입중 오류!");
			ex.setVo(vo);
			throw ex;
		}
		return insertedCount;
	}

	@Override
	public UserVo selectUser(String id) {
		return sqlSession.selectOne("users.selectUserById", id);
	}

	@Override
	public UserVo selectUser(String id, String password) {
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("id", id);
		userMap.put("password", password);
		return sqlSession.selectOne("users.selectUserByIdAndPassword", userMap );
	}

}
