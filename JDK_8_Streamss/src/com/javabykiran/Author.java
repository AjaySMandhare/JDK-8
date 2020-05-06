package com.javabykiran;

public class Author {
	String surName;
	int age;
	Location loc;
	public Author(String surName, int age) {
		super();
		this.surName = surName;
		this.age = age;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
