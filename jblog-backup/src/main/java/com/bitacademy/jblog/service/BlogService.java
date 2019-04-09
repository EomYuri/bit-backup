package com.bitacademy.jblog.service;

import com.bitacademy.jblog.vo.BlogVo;

public interface BlogService {
	
	public boolean create(BlogVo vo);
	public BlogVo getBlog(Long userNo);
	public boolean modify(BlogVo vo);
	
}
