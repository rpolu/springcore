package com.egegant.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.egegant.EmployeeBean;
import com.egegant.StudentBean;

public class Test1 {
	public static void main(String[] args) {

		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config.xml"));

		EmployeeBean eb = bf.getBean("eb", EmployeeBean.class);
		eb.saveEmp();
		eb.saveEmp();
		eb.saveEmp();
		eb.saveEmp();
		eb.saveEmp();

		StudentBean sb = bf.getBean("sb", StudentBean.class);
		sb.saveStudent();
		sb.saveStudent();
		sb.saveStudent();
		sb.saveStudent();

	}

}
