package com.bitacademy.jblog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bitacademy.jblog.service.BlogService;
import com.bitacademy.jblog.service.FileUploadService;
import com.bitacademy.jblog.service.UserService;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.UserVo;

@Controller
public class BlogController {
	@Autowired
	private BlogService blogServiceImpl;
	@Autowired
	private UserService userServiceImpl;
	@Autowired
	FileUploadService fileUploadService;


	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public String blogHome(@PathVariable("id") String id, HttpSession session) {
		//		System.out.println("블로그로 이동");
		UserVo vo = userServiceImpl.getUser(id);
		//		System.out.println("uservo : "+vo);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());
		//		System.out.println("blogVo : "+blogVo);


		if(session.getAttribute("blogVo") != null) {
			session.removeAttribute("blogVo");
		}
		session.setAttribute("blogVo",blogVo);
		//		System.out.println("세션 추가 완료");

		if(blogVo != null)
			return "blog/bloghome";
		else
			return "redirect:/";

	}

	@RequestMapping(value="/{id}/admin/basic", method=RequestMethod.GET)
	public String admin(@PathVariable("id") String id, HttpSession session) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		if(session.getAttribute("blogVo") != null) {
			session.removeAttribute("blogVo");
		}
		session.setAttribute("blogVo",blogVo);
		//		System.out.println("세션 추가 완료");

		if(blogVo != null)
			return "blog/admin";
		else
			return "redirect:/";

	}


	@RequestMapping(value="/{id}/admin/upload", method=RequestMethod.POST)
	public String upload(@PathVariable("id") String id, HttpSession session, 
			@RequestParam("user_file") MultipartFile mFile,@RequestParam("blogtitle") String title) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		String url = "";

		if(mFile != null) {
			String saveFilename = fileUploadService.store(mFile);
			// Image URL 생성
			url = "upload-images/" + saveFilename;
			blogVo.setLogoFile(url);
		}
		blogVo.setBlogTitle(title);

		boolean success = blogServiceImpl.modify(blogVo);

		if(success) {
			if(session.getAttribute("blogVo") != null) {
				session.removeAttribute("blogVo");
			}
			session.setAttribute("blogVo",blogVo);

			return "redirect:/"+id+"/admin/basic";

		}else {
			return "redirect:/"+id+"/admin/basic";
		}
	}
	
	@RequestMapping(value="/{id}/admin/write", method=RequestMethod.GET)
	public String write(@PathVariable("id") String id, HttpSession session) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		if(session.getAttribute("blogVo") != null) {
			session.removeAttribute("blogVo");
		}
		session.setAttribute("blogVo",blogVo);
		//		System.out.println("세션 추가 완료");
		return "blog/post";
	}
	@RequestMapping(value="/{id}/admin/category", method=RequestMethod.GET)
	public String category(@PathVariable("id") String id, HttpSession session) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		if(session.getAttribute("blogVo") != null) {
			session.removeAttribute("blogVo");
		}
		session.setAttribute("blogVo",blogVo);
		//		System.out.println("세션 추가 완료");
		
		return "blog/category";
	}
	
	



}
