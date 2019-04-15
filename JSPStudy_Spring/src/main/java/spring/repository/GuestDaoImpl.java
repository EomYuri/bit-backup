package spring.repository;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.vo.GuestVo;

@Repository
public class GuestDaoImpl implements GuestDao  {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<GuestVo> getList() {
		List<GuestVo> list = sqlSession.selectList("guest.selectAll");
		return list;
	}

	@Override
	public List<GuestVo> getListAsc() {
		List<GuestVo> list = sqlSession.selectList("guest.selectAsc");
		return list;
	}

	@Override
	public int write(GuestVo vo) {
		return sqlSession.insert("guest.insert", vo);
	}

	@Override
	public int delete(Long no) {
		return sqlSession.delete("guest.delete",no);
	}

	@Override
	public int modify(GuestVo vo) {
		return sqlSession.update("guest.modify",vo);
	}
	

	

}
