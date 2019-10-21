package com.elegant.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.spring.StudentBean;

public class TestLifeCycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentBean studentBean = cpxac.getBean(StudentBean.class);
		studentBean.m1();

		StudentBean studentBean1 = (StudentBean) cpxac.getBean("studentBean");
		System.out.println(studentBean1);

	}

}
