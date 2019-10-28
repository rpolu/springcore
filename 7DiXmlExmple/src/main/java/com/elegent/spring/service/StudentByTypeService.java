package com.elegent.spring.service;

import com.elegent.spring.dao.StudentDao;

public class StudentByTypeService {
	private StudentDao sdao;

	public void saveStudent() {
		System.out.println("I need  to save student details");
		sdao.saveStudent();
	}

	public void setSdao(StudentDao sdao) {
		this.sdao = sdao;
	}

}
