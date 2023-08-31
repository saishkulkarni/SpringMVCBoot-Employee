package org.jsp.employee.repository;

import org.jsp.employee.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
