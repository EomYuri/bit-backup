package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.repository.GuestDao;
import spring.vo.GuestVo;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    GuestDao guestDaoImpl;

	@Override
	public List<GuestVo> getGuest() {
		return guestDaoImpl.getList();
	}

	@Override
	public List<GuestVo> getGuestAsc() {
		return guestDaoImpl.getListAsc();
	}

	@Override
	public boolean createGuest(GuestVo vo) {
		return guestDaoImpl.write(vo)==1;
	}

	@Override
	public boolean deleteGuest(Long no) {
		return guestDaoImpl.delete(no)==1;
	}

	@Override
	public boolean modifyGuest(GuestVo vo) {
		return guestDaoImpl.modify(vo)==1;
	}


}
