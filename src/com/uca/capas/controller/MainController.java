package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.StudentDAO;
import com.uca.capas.domain.Student;


@Controller
public class MainController {
	
	@Autowired
	private StudentDAO studentDao;
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		List<Student> student = null;
		try {
			student = studentDao.findALL();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		mav.addObject("student", student);
		mav.setViewName("main");
		
		return mav;
	}
	
	@RequestMapping(value = "/Result", method= RequestMethod.POST)
	public ModelAndView formData(@RequestParam(value="id") int id ) {
		ModelAndView mav = new ModelAndView();
		Student student = null;
		try {
			student = studentDao.findOne(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		mav.addObject("student", student);
		mav.setViewName("Result");
		
		return mav;
	}
	
	
	
}


