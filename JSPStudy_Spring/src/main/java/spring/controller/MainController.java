package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.service.GuestService;
import spring.vo.GuestVo;

@Controller
@RequestMapping("/")
public class MainController {
	@Autowired
	GuestService guestServiceImpl;

	@RequestMapping("")
	public String goMain(Model model) {
		List<GuestVo> list = guestServiceImpl.getGuest();
		System.out.println(list);
		model.addAttribute("list", list);

		return "index";
	}
	
	@RequestMapping("asc")
	public String goAsc(Model model) {
		List<GuestVo> list = guestServiceImpl.getGuestAsc();

		System.out.println(list);
		model.addAttribute("list", list);

		return "asc";
	}

	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String write(@ModelAttribute GuestVo vo) {
		boolean success = guestServiceImpl.createGuest(vo);

		System.out.println("vo : "+vo);
		System.out.println("작성 결과 : "+ success);

		return "redirect:/";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delelteForm(@ModelAttribute GuestVo vo, Model model) {
		model.addAttribute("vo",vo);
		System.out.println("삭제 폼 : "+vo);

		return "deleteform";
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String delelteAction(@ModelAttribute GuestVo vo, @RequestParam("inpass") String inpass) {
		System.out.println("삭제 액션 : "+vo);
		System.out.println("입력 비밀번호 : "+inpass);

		if(vo.getPassword().equals(inpass)) {
			boolean success = guestServiceImpl.deleteGuest(vo.getNo());
			if(success) {
				System.out.println(vo.getNo()+"삭제 성공");
			}else {
				System.out.println(vo.getNo()+"삭제 실패");
			}
		}else {
			System.out.println("비밀번호 틀림");
		}

		return "redirect:/";
	}

	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public String modifyForm(@ModelAttribute GuestVo vo, Model model) {
		model.addAttribute("vo",vo);
		System.out.println("수정 폼 : "+vo);

		return "modifyform";
	}

	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modifyAction(@ModelAttribute GuestVo vo, @RequestParam("inpass") String inpass) {
		System.out.println("수정 액션 : "+vo);
		System.out.println("입력 비밀번호 : "+inpass);

		if(vo.getPassword().equals(inpass)) {
			boolean success = guestServiceImpl.modifyGuest(vo);
			if(success) {
				System.out.println(vo.getNo()+"수정 성공");
			}else {
				System.out.println(vo.getNo()+"수정 실패");
			}
		}else {
			System.out.println("비밀번호 틀림");
		}
		return "redirect:/";
	}
}
