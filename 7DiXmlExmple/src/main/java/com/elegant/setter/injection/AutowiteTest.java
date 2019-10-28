package com.elegant.setter.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegent.spring.service.StudentByConstrcutorService;
import com.elegent.spring.service.StudentByNameService;
import com.elegent.spring.service.StudentByTypeService;

public class AutowiteTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");// sp
		StudentByNameService studentByNameService = applicationContext.getBean("studentByNameService",
				StudentByNameService.class);

		StudentByConstrcutorService studentByConstrcutorService = applicationContext
				.getBean("studentByConstrcutorService", StudentByConstrcutorService.class);

		StudentByTypeService tudentByTypeService = applicationContext.getBean("studentByTypeService",
				StudentByTypeService.class);

		studentByNameService.saveStudent();
		studentByConstrcutorService.saveStudent();
		tudentByTypeService.saveStudent();

	}

}
