package spring.repository;

import java.util.List;

import spring.vo.GuestVo;
//Dao인터페이스 생성
//기능의 이름 및 반환 타입 정의
public interface GuestDao {
	//리스트 출력
	public List<GuestVo> getList();
	public List<GuestVo> getListAsc();
	//방명록 작성
	public int write(GuestVo vo);
	//방명록 삭제
	public int delete(Long no);
	//방명록 수정
	public int modify(GuestVo vo);
}
