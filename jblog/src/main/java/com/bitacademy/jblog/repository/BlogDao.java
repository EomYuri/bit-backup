package com.bitacademy.jblog.repository;

import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.UserVo;

public interface BlogDao {
	public int insert(BlogVo vo);
	public BlogVo selectBlog(Long userNo);
	public int update(BlogVo vo);

}
