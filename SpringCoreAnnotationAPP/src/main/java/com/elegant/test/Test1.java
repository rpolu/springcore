package com.elegant.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.service.StudentService;

public class Test1 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		StudentService ss = applicationContext.getBean(StudentService.class);
		ss.saveStudent(45, "anup schain nakul");
		ss.saveStudent(46, "anup schain nakul");
		ss.saveStudent(46, "anup schain nakul");
		applicationContext.close();

	}

}
