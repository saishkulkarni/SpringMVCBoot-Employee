package org.jsp.employee.controller;

import java.io.IOException;

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
	public String saveData(Employee employee, @RequestParam String date, @RequestParam MultipartFile pic, ModelMap map)
			throws IOException {
		return employeeService.save(employee, date, pic, map);
	}

	@GetMapping("/fetch")
	public String fetchAll(ModelMap map) {
		return employeeService.fetchAll(map);
	}

	@GetMapping("/fetchbyname")
	public String loadName() {
		return "FetchByName";
	}

	@PostMapping("/fetchbyname")
	public String fetchName(@RequestParam String name, ModelMap map) {
		return employeeService.fetchByName(name, map);
	}

	@GetMapping("/fetchbyemail")
	public String loadEmail() {
		return "FetchByEmail";
	}

	@PostMapping("/fetchbyemail")
	public String fetchEmail(@RequestParam String email, ModelMap map) {
		return employeeService.fetchByEmail(email, map);
	}

	@GetMapping("/fetchbymobile")
	public String loadMobile() {
		return "FetchByMobile";
	}

	@PostMapping("/fetchbymobile")
	public String fetchMobile(@RequestParam long mobile, ModelMap map) {
		return employeeService.fetchByMobile(mobile, map);
	}

	@GetMapping("/fetchbycountry")
	public String loadCountry() {
		return "FetchByCountry";
	}

	@PostMapping("/fetchbycountry")
	public String fetchCountry(@RequestParam String country, ModelMap map) {
		return employeeService.fetchByCountry(country, map);
	}

	@GetMapping("/fetchdevind")
	public String fetchDevInd(ModelMap map) {
		return employeeService.fetchByDevInd(map);
	}
	
	@GetMapping("/fetchctc1020")
	public String fetchCtc1020(ModelMap map) {
		return employeeService.fetchCtc1020(map);
	}
	
}
