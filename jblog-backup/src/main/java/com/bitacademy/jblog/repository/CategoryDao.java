package com.bitacademy.jblog.repository;

import java.util.List;

import com.bitacademy.jblog.vo.CategoryVo;

public interface CategoryDao {
	public int insert(CategoryVo vo);
	public List<CategoryVo> selectCategory(Long userNo);

}
