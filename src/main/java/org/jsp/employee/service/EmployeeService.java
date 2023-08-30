package org.jsp.employee.service;

import java.io.IOException;
import java.time.LocalDate;

import org.jsp.employee.dao.EmployeeDao;
import org.jsp.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	public String save(Employee employee, String date, MultipartFile pic, ModelMap map) throws IOException {
		employee.setDob(LocalDate.parse(date));
	
		byte[] picture=new byte[pic.getInputStream().available()];
		pic.getInputStream().read(picture);
		
		employee.setPicture(picture);
		
		employeeDao.save(employee);		
		
		map.put("pos", "Data Added Success");
		return "Home";
	}

}