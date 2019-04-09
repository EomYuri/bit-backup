package com.bitacademy.jblog.repository;

import java.util.List;

import com.bitacademy.jblog.vo.PostVo;

public interface PostDao {
	public int insert(PostVo vo);
	public List<PostVo> selectList(Long cateNo);
	public PostVo selectPost(Long postNo);

}
