package com.elegant.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.dao.StudentDao;
import com.elegant.model.StudentModel;

public class TestDao {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		StudentDao dao = cpxac.getBean(StudentDao.class);
		StudentModel model = new StudentModel();
		model.setRollNum(914);
		model.setName("Elegent");
		model.setMarks(100);
		model.setAddress("bangalore");

		dao.SaveStudent(model);

		System.out.println("Saved successfully");

		cpxac.close();

	}

}
