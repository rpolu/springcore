package com.elegant.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	public void saveStudent(int rollNum, String name) {
		System.out.println(rollNum + " " + name);
		System.out.println("Student Data Saved successfully");
	}
}
