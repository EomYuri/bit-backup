package com.bitacademy.jblog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitacademy.jblog.exception.UserDaoException;
import com.bitacademy.jblog.service.BlogService;
import com.bitacademy.jblog.service.UserService;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.UserVo;

@Controller
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private BlogService blogServiceImpl;


	private static final Logger logger = LoggerFactory.getLogger(UsersController.class);


	@RequestMapping(value = "/join", method=RequestMethod.GET)
	public String join(@ModelAttribute UserVo vo) {
		return "users/joinform";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinAction(@ModelAttribute @Valid UserVo vo, BindingResult result, Model model) {
		// Validation 체크
		logger.debug("회원가입 액션");
		logger.debug("회원가입 정보:" + vo);

		// 오류체크
		if(result.hasErrors()) {
			// 검증 실패
			List<ObjectError> errors = result.getAllErrors(); 
			for(ObjectError e: errors) {
				logger.debug("ERROR:" + e);
			}
			model.addAllAttributes(result.getModel());
			return "users/joinform";
		}

		// 성공하면: /users/joinsuccess로 리다이렉트
		// 실패하면 : /users/join(GET)으로 리다이렉트
		boolean success = false;
		try {
			success = userServiceImpl.join(vo);

		}catch(UserDaoException e) {
			System.err.println("ERROR VO : " + e.getVo());
			e.printStackTrace();
		}

		System.out.println("회원가입:"+success);
		
		UserVo userVo = userServiceImpl.getUser(vo.getId());

		if(success) {
			BlogVo blogVo = new BlogVo();
			blogVo.setUserNo(userVo.getUserNo());
			blogVo.setBlogTitle(userVo.getUserName()+"의 블로그 입니다.");
			blogVo.setLogoFile(null);
			boolean blogsuccess = blogServiceImpl.create(blogVo);
			if(blogsuccess) {
				System.out.println("블로그 생성");
			}else {
				System.out.println("생성 실패");
			}

			
			return "redirect:/users/joinsuccess";
		}else {
			return "redirect:/users/join";
		}
	}
	@RequestMapping(value="/joinsuccess")
	public String joinsuceess() {
		return "users/joinsuccess";
	}

	// 로그인 관련
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginform() {
		return "users/loginform";
	}

	@RequestMapping(value="/login")
	public String loginActtion(@RequestParam(value="id", required=false) String id,
			@RequestParam(value="password", required=false)String password,
			HttpSession session) {
		// 아이디 패스워드 전송되지 않았을 경우 
		// users/login으로 리다이렉트
		if(id.length()==0 || password.length()==0) {
			//			System.err.println("id, password 존재안함");
			System.err.println("로그인 실패");
			System.err.println("아이디/패스워드를 확인해 주세요");

			return "redirect:/users/login";
		}
		UserVo authUser = userServiceImpl.getUser(id, password);

		// authUser != null -> 사용자가 있음 -> Session에 authUser 적재
		if(authUser != null) {
			session.setAttribute("authUser", authUser);
			return "redirect:/";
		}else {
			return "redirect:/users/login";
		}

	}

	// 로그아웃 관련
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logoutform(HttpSession session) {
		session.removeAttribute("authUser");
		// 세션 무효화
		session.invalidate();
		return "redirect:/";
	}

	@ResponseBody
	@RequestMapping(value="/idcheck", method=RequestMethod.GET)
	public Object exists(@RequestParam(value="id", required=true, defaultValue="")String id) {
		System.out.println("아이디 체크");
		UserVo vo = userServiceImpl.getUser(id);
		if(vo != null)
			System.out.println("vo : "+vo.toString());
		else
			System.out.println("해당 아이디가 없음!");
		Map<String, Object> map = new HashMap<>();
		map.put("result", "success");
		map.put("data", vo != null ? "exists" : "not exists");

		return map;
	}

}
