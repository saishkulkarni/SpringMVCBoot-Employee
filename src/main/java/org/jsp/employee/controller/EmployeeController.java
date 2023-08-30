package org.jsp.employee.controller;

import org.jsp.employee.dto.Employee;
import org.jsp.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public String loadHome() {
		return "Home";
	}

	@GetMapping("/insert")
	public String loadInsert() {
		return "Insert";
	}

	@PostMapping("/insert")
	public String saveData(Employee employee, @RequestParam String date, @RequestParam MultipartFile pic,ModelMap map) {
		return employeeService.save(employee,date,pic,map);
	}
}
