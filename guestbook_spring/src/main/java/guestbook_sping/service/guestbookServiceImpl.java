package guestbook_sping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guestbook_sping.repository.guestbookDao;
import guestbook_spring.vo.guestbookVo;

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
		return guestbookDaoImpl.insert(vo)==1;
	}

	@Override
	public boolean delete(Long no) {
		return guestbookDaoImpl.delete(no)==1;
	}

}
