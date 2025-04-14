package com.spring.proj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.proj.entity.Student;

public class Main {
	
	public static void main(String[] args) {
		String config_loc = "com/spring/proj/resources/applicationContext.xml";	
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);		
		
		Student std = (Student) context.getBean("stdId");
		std.display();
	}

}

//for this we have to download jar files manually
//1. Spring-beans-xxx.jar file
//2. Spring-cors-xxx.jar file
//3. Spring-context-xxx.jar file
//4. Common-logging-xxx.jar file
//5. Spring-expression-xxx.jar file
