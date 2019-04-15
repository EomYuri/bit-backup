package guestbook_sping.service;

import java.util.List;

import guestbook_sping.vo.guestbookVo;

public interface guestbookService {
	public List<guestbookVo> getList();
	public boolean write(guestbookVo vo);
	public boolean delete(guestbookVo vo);
}
