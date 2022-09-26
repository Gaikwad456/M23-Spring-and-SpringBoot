package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@SpringBootApplication
@EnableAutoConfiguration
public class Day5SpringStarterProjectApplication {

	public static void main(String[] args) {
		
		//Student s = new Student();
		ConfigurableApplicationContext c = SpringApplication.run(Day5SpringStarterProjectApplication.class, args);
		Student s =c.getBean(Student.class);
		s.display();
		System.out.println("Welcome to M23 Batch");
	}

}
