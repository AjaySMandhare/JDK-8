package com.javabykiran;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx1 {
	public static void main(String[] args) {
		ArrayList<Student> alStudents = new ArrayList<>();
		Student stu1 = new Student();
		stu1.setName("JavaByKiran");
		Student stu2 = new Student();
		stu2.setName("SJavaByKiran");
		alStudents.add(stu1);
		alStudents.add(stu2);

		List<String> names = new ArrayList<>();
		for (Student student : alStudents) {
			if (student.getName().startsWith("J")) {
				names.add(student.getName());
			}
		}
		System.out.println(names);
		
		System.out.println("========= with JDK 1.8 stream classes ========");
		// 1
		List<String> names1 = alStudents.stream()
                .map(Student::getName)
                .filter(name->name.startsWith("J"))
                .limit(10)
                .collect(Collectors.toList());
		System.out.println(names1);
		
		
		//2 
		
		//IntStream.range(1, 10)
		//.forEach(num -> System.out.print(num));
		
		//3
	}
}








