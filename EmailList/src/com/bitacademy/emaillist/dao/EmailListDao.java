package com.bitacademy.emaillist.dao;

import java.util.List;

import com.bitacademy.emaillist.vo.EmailVo;

public interface EmailListDao {
	// 메서드들 선언
	public List<EmailVo> getList();
	public boolean insert(EmailVo vo);
	public boolean delete(Long no);

}
