package guestbook_sping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guestbook_sping.repository.guestbookDao;
import guestbook_sping.vo.guestbookVo;

@Service
public class guestbookServiceImpl implements guestbookService {
	@Autowired
	guestbookDao guestbookDaoImpl;
	
	@Override
	public List<guestbookVo> getMessageList() {
		return guestbookDaoImpl.getList();
	}

	@Override
	public boolean writeMessage(guestbookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMessage(guestbookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
