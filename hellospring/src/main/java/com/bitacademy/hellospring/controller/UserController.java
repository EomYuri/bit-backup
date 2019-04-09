package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitacademy.hellospring.vo.UserVo;

// Type + Method 매핑
// 컨트롤러가 /user URL의 하부 요청을 모두 처리하도록
@Controller
@RequestMapping("/user")

public class UserController {
   @RequestMapping("/joinform")
   public String joinform() {
      return "/WEB-INF/views/joinform.jsp";
   }
   
   // POST 전송 처리 /user/join
   @RequestMapping(value = "/join" ,  method=RequestMethod.POST)
   public String join(@ModelAttribute UserVo vo) {
      // 다수의 파라미터 전송, HTML 폼 데이터를 일괄 전송
      System.out.println("UserVo : " + vo);
      // 가정 : 처리가 잘 되었음. -> 리다이렉트
      return "redirect:/user/joinsuccess";
      
   }
   
   // joinsucces
   @ResponseBody
   @RequestMapping("/joinsuccess")
   public String joinsuccess() {
      return "<h1>JOIN SUCCESS</h1>";
   }
}