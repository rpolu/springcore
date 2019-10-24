package com.elegant;

public class StudentService {

	public void studentCourse() {
		System.out.println("Doing course");
	}

	public static StudentService getService() {
		System.out.println("from factory");
		StudentService service = new StudentService();
		return service;
	}

}
