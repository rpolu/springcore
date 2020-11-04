package com.elegant.springboopapp;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	public void saveData() {
		System.out.println("from EmployeeDao save");
	}
}
