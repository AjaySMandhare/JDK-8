package com.javabykiran;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateEx {

	public static ArrayList<Employee> createEmployees() {
		ArrayList<Employee> alEmp = new ArrayList<>();
		alEmp.add(new Employee(20, "Pune", "Kiran"));
		alEmp.add(new Employee(46, "Nagpur", "Kiran1"));
		alEmp.add(new Employee(34, "Mumbai", "Kiran2"));
		return alEmp;
	}

	public static Predicate<Employee> getAllOldEmp() {
		return p -> p.getAge() > 30;
	}

	public static Predicate<Employee> getAllOldEmp1() {
		return p -> p.getAge() > 45;
	}

	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(getAllOldEmp()).collect(Collectors.toList());
	}

	// return all emp of more age than 30
	public static ArrayList<Employee> allEmpAgeGreaterThan30() {
		ArrayList<Employee> alEmpList = createEmployees();
		alEmpList = (ArrayList<Employee>) alEmpList.stream()
				// .map(age -> age.getAge())
				.filter(finalAge -> finalAge.getAge() > 30).collect(Collectors.toList());
		return alEmpList;
	}

	// return all emp of more age than 30
	public static ArrayList<Integer> allEmpAgeGreaterThan301() {
		ArrayList<Employee> alEmpList = createEmployees();
		ArrayList<Integer> alEmp = (ArrayList<Integer>) alEmpList.stream().map(age -> age.getAge())
				.filter(age -> age > 30).collect(Collectors.toList());
		return alEmp;
	}

	public static void main(String[] args) {

		List<Employee> listOfEmployee = filterEmployees(createEmployees(), getAllOldEmp());

		for (Employee employee : listOfEmployee) {
			System.out.println(employee.getName());
		}
	}
}
