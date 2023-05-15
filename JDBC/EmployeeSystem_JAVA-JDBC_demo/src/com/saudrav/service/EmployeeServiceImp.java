package com.saudrav.service;

import java.util.List;

import com.saudrav.model.Employee;
import com.saudrav.repository.EmployeeRepository;
import com.saudrav.repository.EmployeeRepositoryImp;

public class EmployeeServiceImp implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImp() {
		employeeRepository = new EmployeeRepositoryImp();
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.getAll();
	}

	@Override
	public Employee getById(int id) {
		return employeeRepository.getById(id);
	}

	@Override
	public String addEmployee(Employee employee) {				
		return employeeRepository.addEmployee(employee);
	}

	@Override
	public String updateEmployee(Employee employee) {
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(int id) {
		return employeeRepository.deleteEmployee(id);
	}

}
