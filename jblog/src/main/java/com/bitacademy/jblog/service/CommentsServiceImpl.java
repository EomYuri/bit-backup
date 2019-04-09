package com.bitacademy.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.CommentsDao;
import com.bitacademy.jblog.vo.CommentsVo;
@Service
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	CommentsDao commentsDaoImpl;
	
	@Override
	public List<CommentsVo> getMessageList(Long postNo) {
		return commentsDaoImpl.selectAll(postNo);
	}

	@Override
	public boolean writeMessage(CommentsVo vo) {
		int insertedCount = commentsDaoImpl.insert(vo);
		return insertedCount == 1;
	}

	@Override
	public boolean deleteMessage(CommentsVo vo) {
		int deletedCount = commentsDaoImpl.delete(vo);
		return deletedCount == 1;
	}

}
