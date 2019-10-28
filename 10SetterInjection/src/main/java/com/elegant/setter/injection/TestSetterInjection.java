package com.elegant.setter.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegent.spring.service.StudentService;

public class TestSetterInjection {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");// sp
		StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
		studentService.saveStudent();
		applicationContext.close();
	}

}
