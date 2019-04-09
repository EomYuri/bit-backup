package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.CategoryVo;
@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insert(CategoryVo vo) {
		return sqlSession.insert("category.insert", vo);
		
	}

	@Override
	public List<CategoryVo> selectCategory(Long userNo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("category.select",userNo);
	}

	@Override
	public int delete(CategoryVo vo) {
		return sqlSession.delete("category.delete", vo);
	}

}
