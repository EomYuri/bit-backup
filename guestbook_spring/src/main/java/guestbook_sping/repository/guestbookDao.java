package guestbook_sping.repository;

import java.util.List;

import guestbook_sping.vo.guestbookVo;

public interface guestbookDao {
	// DB에서 방명록들을 가져오는 함수
	public List<guestbookVo> getList();
	// 방명록 추가
	public int insert(guestbookVo vo);
	// 방명록 삭제
	public int delete(Long no);
}
