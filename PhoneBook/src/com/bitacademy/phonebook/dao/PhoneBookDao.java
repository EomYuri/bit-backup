package com.bitacademy.phonebook.dao;

import java.util.List;

import com.bitacademy.phonebook.vo.PhoneBookVo;


public interface PhoneBookDao {
	public List<PhoneBookVo> getList();
	public boolean insert(PhoneBookVo vo);
	public boolean delete(Long id);
	public List<PhoneBookVo> search(String name);

}
