package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.PostVo;

@Repository
public class PostDaoImpl implements PostDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insert(PostVo vo) {
		System.out.println("Dao : "+vo.toString());
		int insertedCount = sqlSession.insert("post.insert", vo);
		return insertedCount;
	}

	@Override
	public List<PostVo> selectList(Long cateNo) {
		return sqlSession.selectList("post.selectList", cateNo);
	}

	@Override
	public PostVo selectPost(Long postNo) {
		return sqlSession.selectOne("post.selectPost", postNo);
	}
}


