package com.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testbean {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Empl empl = (Empl) beanFactory.getBean("eb");
		Empl empl1 = (Empl) beanFactory.getBean("eb");
		Empl empl2 = (Empl) beanFactory.getBean("eb");
		Empl empl3 = (Empl) beanFactory.getBean("eb");

		System.out.println(empl);
		System.out.println(empl1);
		System.out.println(empl2);
		System.out.println(empl3);

	}

}
