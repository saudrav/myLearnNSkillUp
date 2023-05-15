package com.saudrav.service;

import java.util.List;

import com.saudrav.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAll();
	Employee getById(int id);
	String addEmployee(Employee employee);
	String updateEmployee(Employee employee);
	String deleteEmployee(int id);

}
