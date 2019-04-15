package guestbook_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guestbook_sping.service.guestbookService;
import guestbook_sping.vo.guestbookVo;

@Controller
public class MainController {
	@Autowired
	guestbookService guestbookServiceImpl;
	
	@RequestMapping("/")
	public String goMain(Model model) {
		List<guestbookVo> list = guestbookServiceImpl.getList();
		
		model.addAttribute("list", list);
		
		return "index";
	}


}
