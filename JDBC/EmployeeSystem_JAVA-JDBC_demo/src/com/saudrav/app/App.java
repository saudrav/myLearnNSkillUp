package com.saudrav.app;

import java.util.List;
import java.util.Scanner;

import com.saudrav.model.Employee;
import com.saudrav.service.EmployeeService;
import com.saudrav.service.EmployeeServiceImp;

public class App {
	
	private static Scanner sc = new Scanner(System.in);
	private static EmployeeService service = new EmployeeServiceImp();
	
	public static void main(String[] args) {
		
		System.out.println("Employee Management System");
		
		int option;
		
		while(true) {
			System.out.println("1. Show All employees Details");
			System.out.println("2. Get Employee Details by Id");
			System.out.println("3. Add new Employee");
			System.out.println("4. Update Employee Details");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");
			option = sc.nextInt();
			
			switch(option) {
			case 1: {
				showEmployees();
				break;
			}
			case 2: {
				showEmployeeById();
				break;
			}
			case 3: {
				addEmployee();
				break;
			}
			case 4: {
				updateEmployee();
				break;
			}
			case 5: {
				deleteEmployee();
				break;
			}
			case 6: {
				System.exit(0);
			}
			default:
				try {
				throw new IllegalArgumentException("Unexpected value: "+ option);
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage()+"\n----please Retry----");
				}
			}
			
		}
		
	}	
	

	private static void showEmployees() {		
		List<Employee> employees = service.getAll();
		for(Employee employee : employees) {
			System.out.println(employee);
		}		
	}

	private static void showEmployeeById() {
		Employee employee = new Employee();
		System.out.println("Enter Employee Id :");
		int id = sc.nextInt();
		employee = service.getById(id);
		System.out.println(employee);
	}
	
	private static void addEmployee() {
		Employee employee = new Employee();
		System.out.println("Enter Employee Id ");
		employee.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Employee Name ");
		employee.setName(sc.nextLine());
		System.out.println("Enter Employee Gender ");
		employee.setGender(sc.nextLine());
		System.out.println("Enter Employee Age ");
		employee.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Employee Salary ");
		employee.setSalary(sc.nextDouble());
		
		var result = service.addEmployee(employee);
		System.out.println(result);			
	}
	

	private static void updateEmployee() {
		Employee employee = new Employee();
		System.out.println("Enter Employee Id ");
		employee.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter new values to update details for Employee having id : "+employee.getId());
		//System.out.println();
		System.out.println("Enter Employee Name ");
		employee.setName(sc.nextLine());
		System.out.println("Enter Employee Gender ");
		employee.setGender(sc.nextLine());
		System.out.println("Enter Employee Age ");
		employee.setAge(sc.nextInt());			
		sc.nextLine();
		System.out.println("Enter Employee Salary ");
		employee.setSalary(sc.nextDouble()); 
		
		var result = service.updateEmployee(employee);
		System.out.println(result);			
	
	}	

	private static void deleteEmployee() {

		System.out.println("Enter Employee Id :");
		int id = sc.nextInt();
		var result = service.deleteEmployee(id);
		
		System.out.println(result);
		
	}
	
}
