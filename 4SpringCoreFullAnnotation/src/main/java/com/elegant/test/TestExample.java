package com.elegant.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.elegant.bean.EmployeeDao;
import com.elegant.config.SpringConfig;

public class TestExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(SpringConfig.class);
		ctx.refresh();
		EmployeeDao employeeDao1 = ctx.getBean(EmployeeDao.class);
		EmployeeDao employeeDao2 = ctx.getBean("employeeDao", EmployeeDao.class);

		employeeDao1.saveEmp();
	}
}
