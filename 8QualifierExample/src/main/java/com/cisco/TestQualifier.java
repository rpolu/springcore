package com.cisco;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import com.cisco.config.SpringConfig;
import com.cisco.dtag.dao.EmployeeDao;
import com.cisco.dtag.service.EmployeeService;

public class TestQualifier {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(SpringConfig.class);
		annotationConfigApplicationContext.refresh();
		EmployeeService service = annotationConfigApplicationContext.getBean(EmployeeService.class);
		service.m1();

	}

}
