package com.aaplication.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.EmpService;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpService service = applicationContext.getBean("empService", EmpService.class);
		service.saveEmp();

	}

}
