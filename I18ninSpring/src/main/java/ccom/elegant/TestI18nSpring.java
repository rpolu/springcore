package ccom.elegant;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestI18nSpring {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		String greetings = ac.getMessage("user.greet.message", null, Locale.FRENCH);
		String welcomeUser = ac.getMessage("user.welcome", new Object[] { "Nakul", "Sachin" }, Locale.FRENCH);

		System.out.println(greetings);
		System.out.println(welcomeUser);

		ac.close();
	}
}
