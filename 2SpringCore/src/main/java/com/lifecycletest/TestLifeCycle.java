package com.lifecycletest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.helper.EmployeeUtil;

public class TestLifeCycle {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext cpxc = new ClassPathXmlApplicationContext("applicationcontext.xml");
		EmployeeUtil employeeUtil = cpxc.getBean("h", EmployeeUtil.class);
		employeeUtil.service();
		cpxc.close();
	}

}
