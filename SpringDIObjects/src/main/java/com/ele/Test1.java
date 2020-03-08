package com.ele;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test1 {

	public static void main(String[] args) {

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		EmpService empService = beanFactory.getBean("empService", EmpService.class);
		empService.empSave();

	}

}
