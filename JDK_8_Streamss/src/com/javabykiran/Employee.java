package com.javabykiran;

public class Employee {
	int age;
	String loc;
	String name;
	Phone phone;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Employee(int age, String loc, String name) {
		super();
		this.age = age;
		this.loc = loc;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", loc=" + loc + ", name=" + name + ", phone=" + phone + "]";
	}


}
