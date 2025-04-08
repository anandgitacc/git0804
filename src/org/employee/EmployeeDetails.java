package org.employee;

public class EmployeeDetails { // block or body of the class
	
	//methods
	// private - access specifier
	// void    - return type
	// empName - method name
	// ()      - arguments place / parameter / input
	// {}      - block or body of the method
	// ""      - double quote String - it will print all
	private void empName() {
		System.out.println("Employee name : Anand");
	}
	
	private void empId() {
		System.out.println("Employee id : 1001");
	}
	//.......methods
	private void empStatus() {
		System.out.println("Employee status : working / true");
	}
	
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		
	}
	

}
