package com.abhishek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSetterInjection {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// load bean
		FootballCoach coach = context.getBean("myFootballCoach", FootballCoach.class);
		
		// execute bean methods
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneAdvice());
		System.out.println(coach.getTeamName());
		
		// close context
		context.close();
	}

}
