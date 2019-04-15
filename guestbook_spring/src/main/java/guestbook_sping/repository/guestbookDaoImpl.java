package guestbook_sping.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import guestbook_spring.vo.guestbookVo;

@Repository
public class guestbookDaoImpl implements guestbookDao{
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<guestbookVo> getList() {
		return sqlSession.selectList("guest.selectAll");
	}

	@Override
	public int insert(guestbookVo vo) {
		int insertedCount = sqlSession.insert("guest.insert", vo);
		return insertedCount;
	}

	@Override
	public int delete(Long no) {
		int deletedCount = sqlSession.delete("guest.delete", no);
		return deletedCount;
	}
	

	

}
