package com.elegant.ioc;

public class EmpDao {

	private int empNum;
	private String name;
	private String address;

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void m1() {
		System.out.println(empNum + " " + name + " " + address);
	}

}
