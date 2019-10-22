package com.elegant.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class StudentBean implements InitializingBean, DisposableBean {
	
    
	public void destroy() throws Exception {
		System.out.println(" from destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(" from init()");

	}

	public void m1() {
		System.out.println("from m1()");
	}

}
