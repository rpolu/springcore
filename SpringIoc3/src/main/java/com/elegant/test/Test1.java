package com.elegant.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.service.EmployeeService;

public class Test1 {
	public static void main(String[] args) {
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config.xml"));
//		System.out.println(bf);
//		EmployeeService ess = bf.getBean("es", EmployeeService.class);
//		 ess.saveData();

		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		EmployeeService es = ac.getBean("es", EmployeeService.class);
		es.saveData();

	}

}
