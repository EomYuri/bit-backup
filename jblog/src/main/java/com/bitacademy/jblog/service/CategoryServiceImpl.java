package com.bitacademy.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.CategoryDao;
import com.bitacademy.jblog.vo.CategoryVo;
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDaoImpl;
	
	@Override
	public boolean create(CategoryVo vo) {
		return 1 == categoryDaoImpl.insert(vo);
		
	}

	@Override
	public List<CategoryVo>  getCategory(Long userNo) {
		return categoryDaoImpl.selectCategory(userNo);
	}

	@Override
	public boolean delete(CategoryVo vo) {
		return 1 == categoryDaoImpl.delete(vo);
	}

	

}
