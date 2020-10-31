package com.elegant.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.elegant.service.EmployeeService;

public class Test1 {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config.xml"));
		EmployeeService ess = bf.getBean("es", EmployeeService.class);
		ess.saveData();
	}

}
