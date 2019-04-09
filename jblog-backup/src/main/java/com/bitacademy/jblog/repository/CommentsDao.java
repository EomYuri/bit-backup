package com.bitacademy.jblog.repository;

import java.util.List;

import com.bitacademy.jblog.vo.CommentsVo;

public interface CommentsDao {
	public List<CommentsVo> selectAll();
	public int insert(CommentsVo vo);
	public int delete(CommentsVo vo);
	public int view(CommentsVo vo);

}
