package com.abhishek.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneTeller fortuneTeller;
	
	public FootballCoach(FortuneTeller fortuneTeller) {
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
