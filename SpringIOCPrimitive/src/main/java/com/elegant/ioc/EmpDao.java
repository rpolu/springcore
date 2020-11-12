package com.elegant.ioc;

import java.util.List;

public class EmpDao {

	private int empNum;
	private String name;
	private String address;
	private List<String> names;

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
		
		names.stream().forEach(e->System.out.println(e));
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public int getEmpNum() {
		return empNum;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	

}
