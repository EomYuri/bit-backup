package com.bitacademy.myportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitacademy.myportal.service.GuestbookService;
import com.bitacademy.myportal.vo.GuestbookVo;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	@Autowired
	GuestbookService guestbookServiceImpl;
	
	@ResponseBody
	@RequestMapping({"", "/", "/list"})
	public String list() {
		List<GuestbookVo> list = 
				guestbookServiceImpl.getMessageList();
		return list.toString();
	}
}
