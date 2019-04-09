package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 타입 단독 매핑 -> url 하부의 path를 메서드명과 연결시킨다

@Controller
@RequestMapping("/guestbook/*")
public class GuestookController {
	@ResponseBody
	@RequestMapping
	public String list() {
		return "<h1>Guestbook: list</h1>";
	}
	
	@ResponseBody
	@RequestMapping
	public String add() {
		return "<h1>Guestbook: add</h1>";
	}
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "<h1>Guestbook: delete</h1>";
	}
	
}
