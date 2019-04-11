package gusetbookDAO;

import java.util.List;

import guestbookVo.guestbookVo;

public interface guestbookDao {
	// DB에서 방명록들을 가져오는 함수
	public List<guestbookVo> getList();
	// 방명록 추가
	public boolean insert(guestbookVo vo);
	// 방명록 삭제
	public boolean delete(Long no);
}
