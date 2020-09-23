package com.example.Sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Sample.bean.Employee;
import com.example.Sample.service.EmployeeService;


@Controller
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/getAllEmployees")
	public String index(Model model) {
		List<Employee> emplist=service.getAllEmployees();
		model.addAttribute("emplist", emplist);
		return "indexPage";		
	}
	
	@RequestMapping("/createEmployee")
	public ModelAndView createEmployee(ModelAndView model) {
		Employee employee= new Employee();
		model.setViewName("newEmployee");
		model.addObject(employee);
		return model;	
	}
	
	@RequestMapping(value = "/saveEmployee",method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		service.addEmployee(employee);
		return "redirect:/getAllEmployees";	
	}

	@RequestMapping("/editEmployee")
	public ModelAndView editEmployee(@RequestParam long empid) {
		ModelAndView mav=new ModelAndView("editEmployee");
		Employee employee=service.getEmployeeById(empid);
		mav.addObject("employee", employee);
		return mav;
		
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam long empid) {
		service.deleteEmployee(empid);
		return "redirect:/getAllEmployees";
	}
	
}
