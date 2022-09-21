package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
//		System.out.println("Creating Address object and calling set method");		
//		Address address = new Address();
//		address.setAddressId(6);
//		address.setHouseNumber("92");
//		address.setBuildingName("Sayyed Ali");
//		address.setStreet("Link Road");
//		address.setCity("Mumbai");
//		address.setPin("400086");
//		System.out.println(address);
//		
//		System.out.println();
//		
//		System.out.println("Creating Employee object and calling set method");		
//		Employee employee = new Employee();
//		employee.setEmployeeId(101);
//		employee.setName("Suraj");
//		employee.setSalary(800);
//		employee.setHomeAddress(address);
//		System.out.println(employee);
		
		Address address = new Address(12, "512", "Manavta Society", "LBS Marg", "Mumbai", "400072");
		
		Employee employee = new Employee(201, "Siraj", 600, address);
		System.out.println(employee);
		System.out.println("Main Ends");
		
	}

}
