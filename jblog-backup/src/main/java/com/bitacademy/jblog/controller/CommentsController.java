package com.bitacademy.jblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitacademy.jblog.service.CommentsService;
import com.bitacademy.jblog.vo.CommentsVo;

@Controller
@RequestMapping("/comments")
public class CommentsController {
	
	@Autowired
	CommentsService commentsServiceImpl;

	@RequestMapping(value= {"","/","/list"}, method=RequestMethod.GET)
	public String list(Model model) {
		List<CommentsVo> list = 
				commentsServiceImpl.getMessageList();
		
		model.addAttribute("list", list);
		return "comments/list";
	}
	
	@RequestMapping(value="/delete/{userNo}", method=RequestMethod.GET)
	public String deleteform(@PathVariable("userNo") Long userNo, Model model) {
		model.addAttribute("userNo", userNo);
		return "comments/deleteform";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String deleteAction(@ModelAttribute CommentsVo vo) {
		boolean success=commentsServiceImpl.deleteMessage(vo);
//		System.out.println("Delete Result:" + success);
		return "redirect:/comments";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(@ModelAttribute CommentsVo vo) {
		boolean success = commentsServiceImpl.writeMessage(vo);
		return "redirect:/comments";
	}
}

