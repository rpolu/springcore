package com.elegant;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = ac.getBean("s", Student.class);
		student.m1();
		ac.close();

	}

}
