package com.abhishek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// load bean
		Coach coach = context.getBean("myFootballCoach", Coach.class);
		
		// execute bean methods
		System.out.println(coach.getDailyWorkout());
		
		// close context scope
		context.close();
	}

}
