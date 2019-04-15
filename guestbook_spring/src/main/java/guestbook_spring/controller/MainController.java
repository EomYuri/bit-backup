package guestbook_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import guestbook_sping.service.guestbookService;
import guestbook_spring.vo.guestbookVo;

@Controller
@RequestMapping("/")
public class MainController {
	@Autowired
	guestbookService guestbookServiceImpl;
	
	@RequestMapping("")
	public String goMain(Model model) {
		List<guestbookVo> list = guestbookServiceImpl.getList();
		
		model.addAttribute("list", list);
		
		return "index";
	}
	
	@RequestMapping(value = "deleteform", method = RequestMethod.GET)
	public String deleteform(@ModelAttribute guestbookVo vo, Model model) {
		model.addAttribute("vo", vo);
		
		return "deleteform";
	}
	
	@RequestMapping(value="delete", method = RequestMethod.POST)
	public String delete(@ModelAttribute guestbookVo vo, @RequestParam("pass") String pass) {
		
		if(vo.getPassword().equals(pass)) {
			boolean success = guestbookServiceImpl.delete(vo.getNo());
			if(success) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		}else {
			System.out.println("비밀번호 다름");
		}
		return "redirect:/";
	}

	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String write(@ModelAttribute guestbookVo vo, Model model) {
		model.addAttribute("vo", vo);
		boolean success = guestbookServiceImpl.write(vo);
		if(success) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}

		System.out.println(vo);

		return "redirect:/";
	}

}
