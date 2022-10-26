package com.project.pool.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@RequestMapping(value="/qnaboard")
	public ModelAndView qnaboard(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/board/qnaBoard");
		return mv;
	}
	
	@RequestMapping(value="/qna")
	public ModelAndView qna(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/board/qna");
		return mv;
	}
	
	@RequestMapping(value="/reviewboard")
	public ModelAndView reviewboard(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/board/reviewBoard");
		return mv;
	}
	
	@RequestMapping(value="/review")
	public ModelAndView review(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		
		mv.setViewName("/board/review");
		return mv;
	}
	
	
}
