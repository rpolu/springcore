package com.elegant.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.elegant")
@PropertySource("classpath:application.properties")
public class SpringConfig {
	@Value("${emp.name}")
	private String name;
	@Value("${emp.salary}")
	private String salary;

	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
