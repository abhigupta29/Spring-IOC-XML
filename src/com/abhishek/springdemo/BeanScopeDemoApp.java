package com.abhishek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myTrackCoach", Coach.class);
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
		
		boolean object = (coach == theCoach);
		
		System.out.println("Coach and theCoach refers same object: " + object);
		
		System.out.println("Memory location of coach object: " + coach);
		System.out.println("Memory location of coach object: " + theCoach);
		
		context.close();
	}

}
