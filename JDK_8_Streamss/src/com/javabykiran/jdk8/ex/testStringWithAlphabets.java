package com.javabykiran.jdk8.ex;

import java.sql.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class testStringWithAlphabets {
	public static boolean isStringOnlyAlphabet(String str) {
		System.out.println("I am in main");
		System.out.println("Welcome");
		return ((str != null) && (!str.equals("")) && (str.chars().allMatch(Character::isLetter)));
		
	}

		public double CalculateWithFunctionalPrograming(double x, double y) {
			return x * x + y * y;
		}
	
		public double CalculateNonFunctionalPrograming(double x, double y) {
			double z=x+x; 
			double z1=y+y;
			double z2=z+z1;
			return z2;
		}
	
	public static void main(String[] args) {
		System.out.println(isStringOnlyAlphabet("kiran"));
	}
}
