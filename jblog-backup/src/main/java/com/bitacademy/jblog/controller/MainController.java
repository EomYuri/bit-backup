package com.bitacademy.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitacademy.jblog.exception.DaoException;

@Controller
public class MainController {
	@RequestMapping({"/", "/main", "/home"})
	public String main() {
		return "home";
	}
	
}
