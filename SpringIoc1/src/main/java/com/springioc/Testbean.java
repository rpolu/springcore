package com.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testbean {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Empl eb1 = (Empl) beanFactory.getBean("eb");
		Empl eb2 = (Empl) beanFactory.getBean("eb");

		System.out.println(eb1);
		System.out.println(eb2);
	}
}
