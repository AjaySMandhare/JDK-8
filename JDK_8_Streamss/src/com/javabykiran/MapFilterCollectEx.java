package com.javabykiran;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterCollectEx {

	public static ArrayList<Employee> createEmployees() {
		ArrayList<Employee> alEmp = new ArrayList<>();
		alEmp.add(new Employee(20, "Pune", "Kiran"));
		alEmp.add(new Employee(46, "Nagpur", "Kiran1"));
		alEmp.add(new Employee(34, "Mumbai", "Kiran2"));
		return alEmp;
	}

	// return all emp of more age than 30
	public static ArrayList<Integer> allEmpAgeGreaterThan30() {
		ArrayList<Employee> alEmpList = createEmployees();
		ArrayList<Integer> alEmp = (ArrayList<Integer>) alEmpList
				.stream().map(age -> age.getAge())
				.filter(age -> age > 30)
				.collect(Collectors.toList());
		return alEmp;
	}
	// return all emp of more age than 30
	public static ArrayList<Employee> allEmpAge() {
		ArrayList<Employee> alEmpList = createEmployees();
		alEmpList = (ArrayList<Employee>) alEmpList.stream()
				.filter(finalAge -> finalAge.getAge() > 30)
				.collect(Collectors.toList());
		return alEmpList;
	}

	// return all elements having mobile no greater than 30
	public static List<Integer> allEmpMobileNo() {
		ArrayList<Employee> alEmpList = createEmployees();
		List<Integer> alEmp = alEmpList.stream()
				.map(phone -> phone.getPhone())
				.map(mobileNo -> mobileNo.getMobileNo())
				.filter(mobileNo -> mobileNo > 30 )
				.collect(Collectors.toList());
		return alEmp;
	}


	public static void main(String[] args) {
		for (int age : allEmpAgeGreaterThan30()) {
			System.out.println(age);
		}
		for (Employee empAge : allEmpAge()) {
			System.out.println(empAge.getAge());
		}
		for (int empMobNo : allEmpMobileNo()) {
			System.out.println(empMobNo);
		}
	}
}
