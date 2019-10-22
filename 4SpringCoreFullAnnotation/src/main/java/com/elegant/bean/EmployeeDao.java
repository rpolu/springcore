package com.elegant.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elegant.config.SpringConfig;

@Component
public class EmployeeDao {
	@Autowired
	private SpringConfig config;

	public void saveEmp() {
		System.out.println("from saveEmp()");
		System.out.println(config.getName());
		System.out.println(config.getSalary());
	}

}
