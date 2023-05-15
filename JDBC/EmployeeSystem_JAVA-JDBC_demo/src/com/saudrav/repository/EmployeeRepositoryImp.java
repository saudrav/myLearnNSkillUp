package com.saudrav.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.saudrav.model.Employee;
import com.saudrav.util.DBUtil;

public class EmployeeRepositoryImp implements EmployeeRepository{
	
	private Connection conn;
	
	public EmployeeRepositoryImp() {
		conn = DBUtil.getConnection();
	}

	@Override
	public List<Employee> getAll() {
		
		List<Employee> employees = new ArrayList<>();
		
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select * from employee");
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setGender(rs.getString("gender"));
				employee.setAge(rs.getInt("age"));
				employee.setSalary(rs.getDouble("salary"));
				employees.add(employee);
			}
			return employees;
		} catch (SQLException e) {
			System.out.println("Error occured while processing getAll Queary");
		}
		return null;
	}

	@Override
	public Employee getById(int id) {
		
		Employee employee = new Employee();
		
		try {
			PreparedStatement pstm = conn.prepareStatement("select * from employee where id=?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			rs.next();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setGender(rs.getString(3));
			employee.setAge(rs.getInt(4));
			employee.setSalary(rs.getDouble(5));
			
			return employee;
			
		} catch (SQLException e) {
			System.out.println("Error occured while processing getById Queary");
		}
		
		return null;
	}

	@Override
	public String addEmployee(Employee employee) {

		try {
			PreparedStatement pstm = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			pstm.setInt(1, employee.getId());
			pstm.setString(2, employee.getName());
			pstm.setString(3, employee.getGender());
			pstm.setInt(4, employee.getAge());
			pstm.setDouble(5, employee.getSalary());
			int rowresult = pstm.executeUpdate();
			System.out.println("Row affected :"+rowresult); 
			return "Employee with Id "+employee.getId()+" added Successfully.";
		} catch (SQLException e) {
			System.out.println("Error occured while processing addEmployee Queary");
		}
		return null;
	}

	@Override
	public String updateEmployee(Employee employee) {
		
		try {
			PreparedStatement pstm = conn.prepareStatement("update employee set name=?, gender=?, age=?, salary=? where id=?");
			
			pstm.setString(1, employee.getName());
			pstm.setString(2, employee.getGender());
			pstm.setInt(3, employee.getAge());
			pstm.setDouble(4, employee.getSalary());
			pstm.setInt(5, employee.getId());
			
			int rowresult = pstm.executeUpdate();
			System.out.println("Row affected :"+rowresult); 
			return "Details of Employee with Id="+employee.getId()+" updated Successfully.";
		} catch (SQLException e) {
			System.out.println("Error occured while processing updateEmployee Queary");
		}
		
		return null;
	}

	@Override
	public String deleteEmployee(int id) {
		

		try {
			PreparedStatement pstm = conn.prepareStatement("delete from employee where id=?");
			pstm.setInt(1, id);
			int row = pstm.executeUpdate();
			return "Employee with id="+id+" deleted successfully.";			
			
		} catch (SQLException e) {
			System.out.println("Error occured while processing getById Queary");
		}
		
		return null;
	}

}
