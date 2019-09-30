package com.abhishek.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneTeller fortuneTeller;
	
	public CricketCoach(FortuneTeller fortuneTeller) {
		this.fortuneTeller = fortuneTeller;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 30 minutes of batting practice";
	}

	@Override
	public String getFortuneAdvice() {
		// TODO Auto-generated method stub
		return fortuneTeller.getFortuneAdvice();
	}

}
