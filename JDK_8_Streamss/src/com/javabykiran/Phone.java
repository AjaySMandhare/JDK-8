package com.javabykiran;

public class Phone {
	int mobileNo;

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Phone [mobileNo=" + mobileNo + "]";
	}
}
