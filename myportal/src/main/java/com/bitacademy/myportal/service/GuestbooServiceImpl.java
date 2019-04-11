package com.bitacademy.myportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.myportal.repository.GuestbookDao;
import com.bitacademy.myportal.vo.GuestbookVo;
@Service
public class GuestbooServiceImpl implements GuestbookService {
	@Autowired
	GuestbookDao guestbookDaoImpl;
	
	@Override
	public List<GuestbookVo> getMessageList() {
		return guestbookDaoImpl.selectAll();
	}

	@Override
	public boolean writeMessage(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMessage(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
