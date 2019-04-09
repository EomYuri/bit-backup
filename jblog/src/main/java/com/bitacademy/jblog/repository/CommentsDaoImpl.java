package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.CommentsVo;
@Repository
public class CommentsDaoImpl implements CommentsDao {
@Autowired
SqlSession sqlSession;

	@Override
	public List<CommentsVo> selectAll(Long postNo) {
		return sqlSession.selectList("comments.select",postNo);
	}

	@Override
	public int insert(CommentsVo vo) {
		return sqlSession.insert("comments.insert", vo);
	}

	@Override
	public int delete(CommentsVo vo) {
		return sqlSession.delete("comments.delete", vo);
	}

}
