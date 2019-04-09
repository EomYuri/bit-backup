package com.bitacademy.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.PostDao;
import com.bitacademy.jblog.vo.PostVo;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	PostDao postDaoImpl;

	@Override
	public boolean create(PostVo vo) {
		return 1 == postDaoImpl.insert(vo);
	}

	@Override
	public List<PostVo> getList(Long cateNo) {
		return postDaoImpl.selectList(cateNo);
	}

	@Override
	public PostVo getPost(Long postNo) {
		return postDaoImpl.selectPost(postNo);
	}

}
