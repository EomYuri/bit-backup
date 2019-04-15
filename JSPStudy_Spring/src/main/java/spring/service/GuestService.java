package spring.service;

import java.util.List;

import spring.vo.GuestVo;

public interface GuestService {
	public List<GuestVo> getGuest();
	public List<GuestVo> getGuestAsc();
	public boolean createGuest(GuestVo vo);
	public boolean deleteGuest(Long no);
	public boolean modifyGuest(GuestVo vo);
}
