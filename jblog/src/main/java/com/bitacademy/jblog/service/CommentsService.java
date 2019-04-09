package com.bitacademy.jblog.service;

import java.util.List;

import com.bitacademy.jblog.vo.CommentsVo;

public interface CommentsService {
	public List<CommentsVo> getMessageList(Long postNo);
	public boolean writeMessage(CommentsVo vo);
	public boolean deleteMessage(CommentsVo vo);
}
