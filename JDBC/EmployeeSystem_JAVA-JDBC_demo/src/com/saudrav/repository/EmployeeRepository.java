package com.saudrav.repository;

import java.util.List;

import com.saudrav.model.Employee;

public interface EmployeeRepository {
	
	List<Employee> getAll();
	Employee getById(int id);
	String addEmployee(Employee employee);
	String updateEmployee(Employee employee);
	String deleteEmployee(int id);

}
