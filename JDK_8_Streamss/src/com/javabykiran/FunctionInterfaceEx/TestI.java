package com.javabykiran.FunctionInterfaceEx;

public interface TestI {

	static String multiply() {
		return null;
	}

	default String divide() {
		return null;
	}

	@Override
	public String toString();
}
