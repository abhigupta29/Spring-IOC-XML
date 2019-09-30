package com.abhishek.springdemo;

public class TrackCoach implements Coach {
	private Fortune fortuneTeller;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneTeller fortuneTeller) {
		this.fortuneTeller = fortuneTeller;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do a track of 500 metre";
	}

	@Override
	public String getFortuneAdvice() {
		// TODO Auto-generated method stub
		return fortuneTeller.getFortuneAdvice();
	}
	
}
