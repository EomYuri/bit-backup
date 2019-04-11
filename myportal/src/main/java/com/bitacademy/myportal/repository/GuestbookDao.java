package com.bitacademy.myportal.repository;

import java.util.List;

import com.bitacademy.myportal.vo.GuestbookVo;

public interface GuestbookDao {
	//	EJB 권고사항 DAO의 메서드명은
	//	실제 CRUD 작업을 위한 일반적인 이름을 따르도록 한다
	//	insert, select, update, delete
	//	selectByEamilAndPassword
	public List<GuestbookVo> selectAll();
	public int insert(GuestbookVo vo);
	public int delete(GuestbookVo vo);
}
