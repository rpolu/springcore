package com.spring.factory.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.school.School;
import com.elegant.service.StudentService;

public class TestSpringFactory {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		studentService.studentCourse();

		School s = (School) applicationContext.getBean("schoolFactory");
		System.out.println(s.toString());
		applicationContext.close();
	}

}
