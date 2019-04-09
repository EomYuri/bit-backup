package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.BlogDao;
import com.bitacademy.jblog.vo.BlogVo;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	BlogDao blogDaoImpl;

	@Override
	public boolean create(BlogVo vo) {
		return 1 == blogDaoImpl.insert(vo);
	}

	@Override
	public BlogVo getBlog(Long userNo) {
		return blogDaoImpl.selectBlog(userNo);
	}

	@Override
	public boolean modify(BlogVo vo) {
		return blogDaoImpl.update(vo)==1;
	}

}
