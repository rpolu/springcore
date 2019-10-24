package com.elegent.spring.sp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("beans.xml");
		ServiceReceiver serviceReceiver = cpxac.getBean("sr", ServiceReceiver.class);
		serviceReceiver.getService();

		

	}

}
