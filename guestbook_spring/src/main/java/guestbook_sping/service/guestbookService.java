package guestbook_sping.service;

import java.util.List;

import guestbook_sping.vo.guestbookVo;

public interface guestbookService {
	public List<guestbookVo> getMessageList();
	public boolean writeMessage(guestbookVo vo);
	public boolean deleteMessage(guestbookVo vo);
}
