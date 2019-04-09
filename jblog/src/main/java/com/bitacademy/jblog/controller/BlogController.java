package com.bitacademy.jblog.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bitacademy.jblog.service.BlogService;
import com.bitacademy.jblog.service.CategoryService;
import com.bitacademy.jblog.service.CommentsService;
import com.bitacademy.jblog.service.FileUploadService;
import com.bitacademy.jblog.service.PostService;
import com.bitacademy.jblog.service.UserService;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.CategoryVo;
import com.bitacademy.jblog.vo.CommentsVo;
import com.bitacademy.jblog.vo.PostVo;
import com.bitacademy.jblog.vo.UserVo;

@Controller
public class BlogController {
	@Autowired
	private BlogService blogServiceImpl;
	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private CategoryService categoryServiceImpl;
	@Autowired
	private PostService postServiceImpl;
	@Autowired
	private CommentsService commentsServiceImpl;
	
	@Autowired
	FileUploadService fileUploadService;


	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public String blogHome(@PathVariable("id") String id, HttpSession session, Model model) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		model.addAttribute("blogUser", vo);

		model.addAttribute("blogVo",blogVo);

		List<CategoryVo> CateList = categoryServiceImpl.getCategory(vo.getUserNo());
		model.addAttribute("cateList",CateList);

		List<PostVo> WholeList = new ArrayList<>();
		for(int i = 0; i<CateList.size();i++) {
			WholeList.addAll(postServiceImpl.getList(CateList.get(i).getCateNo()));
		}
		if(!WholeList.isEmpty()) {
			PostVo latest = WholeList.get(WholeList.size()-1);
			model.addAttribute("PostVo",latest);
			System.out.println(latest);
			model.addAttribute("PostList",WholeList);

			List<CommentsVo> commentsList = commentsServiceImpl.getMessageList(latest.getPostNo());
			model.addAttribute("CommentsList", commentsList);
			
		}else {
			PostVo nullVo = new PostVo();
			nullVo.setPostTitle("블로그에 글이 없습니다.");
			nullVo.setPostContent("내용도 없음.");
			model.addAttribute("PostVo",nullVo);
		}

		if(blogVo != null)
			return "blog/bloghome";
		else
			return "redirect:/";

	}
	
	@RequestMapping(value="/{id}/category/{cateNo}", method=RequestMethod.GET)
	public String catelatest(@PathVariable("id") String id, @PathVariable("cateNo") Long cateNo, Model model) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		model.addAttribute("blogUser", vo);

		model.addAttribute("blogVo", blogVo);

		List<CategoryVo> CateList = categoryServiceImpl.getCategory(vo.getUserNo());
		model.addAttribute("cateList",CateList);

		//여기 위에 까지는 기본설정

		List<PostVo> postList = postServiceImpl.getList(cateNo);
		if(!postList.isEmpty()) {
			PostVo postVo = postList.get(postList.size()-1);
			model.addAttribute("PostVo", postVo);
			model.addAttribute("PostList",postList);
			
			List<CommentsVo> commentsList = commentsServiceImpl.getMessageList(postVo.getPostNo());
			model.addAttribute("CommentsList", commentsList);
		}else {
			PostVo nullVo = new PostVo();
			nullVo.setPostTitle("블로그에 글이 없습니다.");
			nullVo.setPostContent("내용도 없음.");
			model.addAttribute("PostVo",nullVo);
		}
		
		return "blog/bloghome";
	}
	
	@RequestMapping(value="/{id}/category/total", method=RequestMethod.GET)
	public String getTotal(@PathVariable("id") String id, Model model) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		model.addAttribute("blogUser", vo);

		model.addAttribute("blogVo",blogVo);

		List<CategoryVo> CateList = categoryServiceImpl.getCategory(vo.getUserNo());
		model.addAttribute("cateList",CateList);

		List<PostVo> WholeList = new ArrayList<>();
		for(int i = 0; i<CateList.size();i++) {
			WholeList.addAll(postServiceImpl.getList(CateList.get(i).getCateNo()));
		}

		if(!WholeList.isEmpty()) {
			PostVo latest = WholeList.get(WholeList.size()-1);
			model.addAttribute("PostVo",latest);
			model.addAttribute("PostList",WholeList);
			
			List<CommentsVo> commentsList = commentsServiceImpl.getMessageList(latest.getPostNo());
			model.addAttribute("CommentsList", commentsList);
		}else {
			PostVo nullVo = new PostVo();
			nullVo.setPostTitle("블로그에 글이 없습니다.");
			nullVo.setPostContent("내용도 없음.");
			model.addAttribute("PostVo",nullVo);
		}

		if(blogVo != null)
			return "blog/bloghome";
		else
			return "redirect:/";
	}
	
	@RequestMapping(value="/{id}/post/{postNo}", method=RequestMethod.GET)
	public String posttitle(@PathVariable("id") String id, @PathVariable("postNo") Long postNo, Model model) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		model.addAttribute("blogUser", vo);

		model.addAttribute("blogVo",blogVo);

		List<CategoryVo> CateList = categoryServiceImpl.getCategory(vo.getUserNo());
		System.out.println("list:"+CateList);
		model.addAttribute("cateList",CateList);
		
		PostVo postVo = postServiceImpl.getPost(postNo);
		model.addAttribute("PostVo", postVo);
		
		List<CommentsVo> commentsList = commentsServiceImpl.getMessageList(postVo.getPostNo());
		model.addAttribute("CommentsList", commentsList);
		
		List<PostVo> postList = postServiceImpl.getList(postVo.getCateNo());
		if(!postList.isEmpty()) {
			model.addAttribute("PostList",postList);
		}
		
		return "blog/bloghome";
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
	public String write(@PathVariable("id") String id, Model model) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		model.addAttribute("blogVo",blogVo);
		//		System.out.println("세션 추가 완료");

		List<CategoryVo> cateList = categoryServiceImpl.getCategory(vo.getUserNo());
		model.addAttribute("cateList", cateList);

		return "blog/post";
	}

	@RequestMapping(value="/{id}/admin/write", method=RequestMethod.POST)
	public String writeAction(@PathVariable("id") String id, @ModelAttribute PostVo vo, Model model) {
		boolean success = postServiceImpl.create(vo);
		if(success) {
			return "redirect:/"+id;
		}else {
			return "blog/post";
		}
	}


	@RequestMapping(value="/{id}/admin/category", method=RequestMethod.GET)
	public String category(@PathVariable("id") String id, HttpSession session, Model model) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		if(session.getAttribute("blogVo") != null) {
			session.removeAttribute("blogVo");
		}
		session.setAttribute("blogVo",blogVo);
		//		System.out.println("세션 추가 완료");

		List<CategoryVo> list = categoryServiceImpl.getCategory(vo.getUserNo());
		System.out.println("list:"+list);
		model.addAttribute("cateList",list);

		return "blog/category";
	}

	// 카테고리 삭제
	@RequestMapping(value="/{id}/admin/category/delete/{cateNo}", method=RequestMethod.GET)
	public String deleteCategory(@PathVariable("id") String id, @PathVariable("cateNo") Long cateNo, HttpSession session) {
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());
		CategoryVo categoryVo = new CategoryVo();
		categoryVo.setCateNo(cateNo);


		if(session.getAttribute("blogVo") != null) {
			session.removeAttribute("blogVo");
		}
		session.setAttribute("blogVo",blogVo);
		//		System.out.println("세션 추가 완료");

		boolean success = categoryServiceImpl.delete(categoryVo);
		if(success) {
			System.out.println("카테고리삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		return "redirect:/"+id+"/admin/category";
	}

	// 카테고리 추가
	@RequestMapping(value="/{id}/admin/category/add", method=RequestMethod.POST)
	public String insertCategory(@PathVariable("id") String id, @ModelAttribute CategoryVo categoryVo, HttpSession session) {
		System.out.println("카테고리 생성 시작");
		UserVo vo = userServiceImpl.getUser(id);
		BlogVo blogVo = blogServiceImpl.getBlog(vo.getUserNo());

		categoryVo.setUserNo(vo.getUserNo());

		boolean success = categoryServiceImpl.create(categoryVo);
		System.out.println("생성 정보 : "+categoryVo);
		if(success) {
			System.out.println("카테고리 생성 성공");
		}else {
			System.out.println("생성 실패");
		}
		return "redirect:/"+id+"/admin/category";
	}
	
	//댓글 작성
	@RequestMapping(value="/{id}/comments/{postNo}/{authNo}", method=RequestMethod.POST)
	public String commentsWrite(@PathVariable("id") String id, @PathVariable("postNo") Long postNo, @PathVariable("authNo") Long authNo,
			@ModelAttribute CommentsVo commVo) {
		commVo.setPostNo(postNo);
		commVo.setUserNo(authNo);
		
		boolean success = commentsServiceImpl.writeMessage(commVo);

		if(success) {
			System.out.println("댓글 생성 성공");
		}else {
			System.out.println("생성 실패");
		}
		
		return "redirect:/"+id+"/post/"+postNo;
			
	}
}
