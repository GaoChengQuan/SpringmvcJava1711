package com.situ.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.situ.ssm.entity.Student;

@Controller
@RequestMapping(value="/student")
public class StudentController {

	@RequestMapping(value="/add")
	public ModelAndView add(Student student) {
		System.out.println(student);
		//request.setAttribute("student", student);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", student);
		//request.getRequestDispatcher("/student_info.jsp").forward();
		modelAndView.setViewName("/student_info.jsp");
		return modelAndView;
	}
}
