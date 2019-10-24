package com.test.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sping.service.EmployeeService;

public class TestAutowire {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");// sp
		EmployeeService es = applicationContext.getBean("empService", EmployeeService.class);
		es.getEmployee();

	}

}
