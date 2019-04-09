package com.bitacademy.jblog.repository;

import java.util.List;

import com.bitacademy.jblog.vo.CommentsVo;

public interface CommentsDao {
	public List<CommentsVo> selectAll(Long postNo);
	public int insert(CommentsVo vo);
	public int delete(CommentsVo vo);

}
