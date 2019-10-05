package com.abhishek.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneTeller fortuneTeller;
	
	public FootballCoach() {
		System.out.println("FootballCoach : Inside constructor");
	}
	
	public void setFortuneTeller(FortuneTeller fortuneTeller) {
		System.out.println("FootballCoach : Inside setter");
		this.fortuneTeller = fortuneTeller;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Shooting practice for 2 hours";
	}

	@Override
	public String getFortuneAdvice() {
		// TODO Auto-generated method stub
		return fortuneTeller.getFortuneAdvice();
	}

}
