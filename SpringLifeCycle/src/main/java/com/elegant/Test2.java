package com.elegant;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = ac.getBean("e", Employee.class);
		employee.displayData();
		ac.close();
	}

}
