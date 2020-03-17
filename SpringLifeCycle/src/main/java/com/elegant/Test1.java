package com.elegant;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test1 {

	public static void main(String[] args) {
		BeanFactory ac = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		// Student student = ac.getBean("s", Student.class);
		// student.m1();
		// ac.close();

	}

}
