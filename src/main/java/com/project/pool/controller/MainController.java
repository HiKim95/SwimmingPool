package com.project.pool.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/pool")
	public ModelAndView pool(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/intro/introPool");
		return mv;
	}
	
	@RequestMapping(value="/teacher")
	public ModelAndView teacher(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/intro/introTeacher");
		return mv;
	}
	@RequestMapping(value="/classes")
	public ModelAndView classes(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/intro/introClasses");
		return mv;
	}
}
