package com.bitacademy.jblog.service;

import java.util.List;

import com.bitacademy.jblog.vo.CategoryVo;

public interface CategoryService {
	
	public boolean create(CategoryVo vo);
	public List<CategoryVo> getCategory(Long userNo);
	public boolean delete(CategoryVo vo);

}
