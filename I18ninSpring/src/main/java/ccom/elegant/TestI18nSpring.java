package ccom.elegant;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestI18nSpring {

	public static void main(String[] args) {
		String user = "Thulasi";

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		String greetings = classPathXmlApplicationContext.getMessage("user.greet.message", null, Locale.ITALY);
		String welcomeUser = classPathXmlApplicationContext.getMessage("user.welcome", new Object[] { user },
				Locale.ITALIAN);
		System.out.println(greetings);
		System.out.println(welcomeUser);

		classPathXmlApplicationContext.close();
	}
}
