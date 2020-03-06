package com.elegant.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.elegant.ioc.EmpDao;

public class TestSetterInInjection {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

		EmpDao empDao = beanFactory.getBean("empDao", EmpDao.class);
		empDao.m1();
	}

}
