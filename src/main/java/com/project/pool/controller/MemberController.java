package com.project.pool.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@RequestMapping(value="/signinf" )
	public ModelAndView signinf(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/member/signIn");
		return mv;
	}
	
	@RequestMapping(value="/signin", method = RequestMethod.POST)
	public ModelAndView signin(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/home");
		return mv;
	}
	
	@RequestMapping(value="/mdetail")
	public ModelAndView mdetail(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		String uri = "/member/mdetail";
		
		if ("U".equals(request.getParameter("jCode"))) {
			uri = "/member/mupdate";
		}
		
		mv.setViewName(uri);
		return mv;
	}
	
	@RequestMapping(value="/mupdate", method = RequestMethod.POST)
	public ModelAndView mupdate(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("redirect:mdetail");
		return mv;
	}
	
	@RequestMapping(value="/signupf")
	public ModelAndView signupf(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/member/signUp");
		return mv;
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public ModelAndView signup(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("redirect:signinf");
		return mv;
	}
	
	@RequestMapping(value="/classregif")
	public ModelAndView classregif(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/member/classRegi");
		return mv;
	}
	
	@RequestMapping(value="/classregi")
	public ModelAndView classregi(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("redirect:mdetail");
		return mv;
	}
	
	@RequestMapping(value="/locker")
	public ModelAndView locker(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/member/locker");
		return mv;
	}
	
	@RequestMapping(value="/lockeruse")
	public ModelAndView lockeruse(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("redirect:locker");
		return mv;
	}
	
}
