package com.egegant;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentBean implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("from init of StudentBean");
	}

	public void saveStudent() {
		System.out.println("Student Data Saved.");
	}

	public void destroy() throws Exception {
		System.out.println("from Destroy of StudentBean");
	}

}
