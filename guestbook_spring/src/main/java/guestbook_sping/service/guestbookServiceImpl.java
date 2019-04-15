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
	public List<guestbookVo> getList() {
		return guestbookDaoImpl.getList();
	}

	@Override
	public boolean write(guestbookVo vo) {
		return false;
	}

	@Override
	public boolean delete(guestbookVo vo) {
		return false;
	}

}
