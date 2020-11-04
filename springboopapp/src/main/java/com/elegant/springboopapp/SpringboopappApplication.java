package com.elegant.springboopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.elegant")
public class SpringboopappApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringboopappApplication.class, args);

		EmployeeService employeeService = ac.getBean(EmployeeService.class);
		employeeService.m1();
	}

}
