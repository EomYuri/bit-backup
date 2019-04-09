package com.bitacademy.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.UserVo;

@Repository
public class BlogDaoImpl implements BlogDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insert(BlogVo vo) {
		System.out.println("Dao : "+vo.toString());
		int insertedCount = sqlSession.insert("blog.insert", vo);
		return insertedCount;
	}

	@Override
	public BlogVo selectBlog(Long userNo) {
		return sqlSession.selectOne("blog.selectBlog", userNo);
	}

	@Override
	public int update(BlogVo vo) {
		return sqlSession.update("blog.update",vo);
	}

}
