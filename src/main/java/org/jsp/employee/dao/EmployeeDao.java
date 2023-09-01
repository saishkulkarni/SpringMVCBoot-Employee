package org.jsp.employee.dao;

import java.util.List;

import org.jsp.employee.dto.Employee;
import org.jsp.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public List<Employee> fetchAll() {
		return employeeRepository.findAll();
	}

	public List<Employee> fetchByName(String name) {
		return employeeRepository.findByName(name);
	}

}
