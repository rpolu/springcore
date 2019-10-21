package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");// sp
		Child child = applicationContext.getBean(Child.class);
		child.needService();

		Child child1 = applicationContext.getBean(Child.class);
		Child child2 = applicationContext.getBean(Child.class);
		Child child3 = applicationContext.getBean(Child.class);

		System.out.println(child1);
		System.out.println(child2);
		System.out.println(child3);

	}

}
