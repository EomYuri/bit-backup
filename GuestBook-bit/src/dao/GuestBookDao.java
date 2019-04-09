package dao;

import java.util.List;

import vo.GuestVo;

public interface GuestBookDao {
	// 메서드 선언
		public List<GuestVo> getList();
		public boolean insert(GuestVo vo);
		public boolean delete(Long no);

}
