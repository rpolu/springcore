package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.StudentService;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		studentService.studentCourse();
	}

}
