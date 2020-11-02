package com.egegant;

import javax.annotation.PostConstruct;

public class EmployeeBean {
	public void init() {
		System.out.println("from init method");
	}

	public void saveEmp() {
		System.out.println("Data Saved");
	}

	public void destroy() {
		System.out.println("Destroy init method");
	}
}
