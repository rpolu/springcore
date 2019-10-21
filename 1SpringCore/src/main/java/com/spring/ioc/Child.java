package com.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Child {

	@Autowired
	private Father father;

	public void needService() {
		System.out.println(" I need service");
		father.provideService();
	}

}
