package org.jsp.employee.repository;

import java.util.List;

import org.jsp.employee.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);

	List<Employee> findByEmail(String email);

	List<Employee> findByMobile(long mobile);

	List<Employee> findByCountry(String country);

	List<Employee> findByRoleAndCountry(String string, String string2);

	List<Employee> findByCtcBetween(int string, int string2);
}
