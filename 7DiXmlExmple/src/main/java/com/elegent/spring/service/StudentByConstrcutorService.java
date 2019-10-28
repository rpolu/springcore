package com.elegent.spring.service;

import com.elegent.spring.dao.StudentDao;

public class StudentByConstrcutorService {
	private StudentDao studentDao;

	public StudentByConstrcutorService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void saveStudent() {
		System.out.println("I need  to save student details");
		studentDao.saveStudent();
	}
}
