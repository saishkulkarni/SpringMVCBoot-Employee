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

	public List<Employee> fetchByEmail(String email) {
		return employeeRepository.findByEmail(email);
	}

	public List<Employee> fetchByMobile(long mobile) {
		return employeeRepository.findByMobile(mobile);
	}

	public List<Employee> fetchByCountry(String country) {
		return employeeRepository.findByCountry(country);
	}

	public List<Employee> fetchByDevInd() {
		return employeeRepository.findByRoleAndCountry("developer","India");
	}

	public List<Employee> fetchCtc1020() {
		return employeeRepository.findByCtcBetween(10,20);
	}

}
