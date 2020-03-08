package com.elegant;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestConstrcutorInjection {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("config.xml"));

		EmpController empController = beanFactory.getBean("empCon", EmpController.class);
		empController.needTosave(10, "rama");
	}
}
