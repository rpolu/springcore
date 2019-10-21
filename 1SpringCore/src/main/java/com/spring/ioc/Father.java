package com.spring.ioc;

import org.springframework.stereotype.Component;

@Component
public class Father {
	public void provideService() {
		System.out.println(" i will provide the service");
	}
}
