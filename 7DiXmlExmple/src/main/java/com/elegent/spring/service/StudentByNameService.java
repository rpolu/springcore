package com.elegent.spring.service;

import com.elegent.spring.dao.StudentDao;

public class StudentByNameService {
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void saveStudent() {
		System.out.println("I need  to save student details");
		studentDao.saveStudent();
	}

}
