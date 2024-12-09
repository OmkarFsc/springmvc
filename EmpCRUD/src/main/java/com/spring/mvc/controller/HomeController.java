package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.Dao.Empdao;
import com.spring.mvc.entity.Emp;

@Controller
public class HomeController {

	private Empdao empdao;
	
	@RequestMapping(path="/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(path="/addEmp")
	public String addEmp()
	{
		return "add_emp";
	}
	@RequestMapping(path="/createEmp",method=RequestMethod.POST)
	public String createEmp(@ModelAttribute Emp  emp)
	{
		System.out.println(emp);
		int i=empdao.saveEmp(emp);
		
		return "add_emp";
	}
}
