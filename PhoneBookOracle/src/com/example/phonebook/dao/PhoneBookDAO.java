package com.example.phonebook.dao;

import java.util.List;

import com.example.phonebook.vo.PhoneBookVO;

public interface PhoneBookDAO {
	public List<PhoneBookVO> getList();
	public boolean insert(PhoneBookVO phonebookVO);
	public boolean deldete(Long id);
	public PhoneBookVO get(String name);

}
