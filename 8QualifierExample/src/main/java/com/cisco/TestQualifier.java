package com.cisco;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import com.cisco.config.SpringConfig;
import com.cisco.dtag.dao.DtagDao;
import com.cisco.dtag.service.DtagService;

public class TestQualifier {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(SpringConfig.class);
		annotationConfigApplicationContext.refresh();
		DtagService service = annotationConfigApplicationContext.getBean(DtagService.class);
		service.m1();

	}

}
