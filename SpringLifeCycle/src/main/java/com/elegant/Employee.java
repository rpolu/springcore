package com.elegant;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("from afterPropertiesSet() ");
	}

	void displayData() {
		System.out.println(101);
		System.out.println("Rama");
	}

	public void destroy() throws Exception {
		System.out.println("from destroy()");
	}

}
