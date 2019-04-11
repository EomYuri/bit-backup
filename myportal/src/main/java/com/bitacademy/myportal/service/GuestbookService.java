package com.bitacademy.myportal.service;

import java.util.List;

import com.bitacademy.myportal.vo.GuestbookVo;

public interface GuestbookService {
	public List<GuestbookVo> getMessageList();
	public boolean writeMessage(GuestbookVo vo);
	public boolean deleteMessage(GuestbookVo vo);
}
