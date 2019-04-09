package com.bitacademy.jblog.service;

import java.util.List;

import com.bitacademy.jblog.vo.PostVo;

public interface PostService {
	
	public boolean create(PostVo vo);
	public List<PostVo> getList(Long cateNo);
	public PostVo getPost(Long postNo);
	
}
