package guestbook_sping.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import guestbook_sping.vo.guestbookVo;

@Repository
public class guestbookDaoImpl implements guestbookDao{
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<guestbookVo> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(guestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long no) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	

}
