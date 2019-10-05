package com.abhishek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSetterInjection {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// load bean
		Coach coach = context.getBean("myFootballCoach", Coach.class);
		
		// execute bean methods
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneAdvice());
		
		// close context
		context.close();
	}

}
