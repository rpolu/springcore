package com.elegent.spring.service;

import com.elegent.spring.dao.StudentDao;

public class StudentService {
	private StudentDao studentDao;

	public void saveStudent() {
		System.out.println("I need  to save student details");
		studentDao.saveStudent();
	}

	/**
	 * @param studentDao the studentDao to set
	 */
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
