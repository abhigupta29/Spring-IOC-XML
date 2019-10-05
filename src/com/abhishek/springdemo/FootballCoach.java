package com.abhishek.springdemo;

public class FootballCoach implements Coach {
	
	private String teamName;
	private FortuneTeller fortuneTeller;
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("FootballCoach : Inside setter - setTeamName");
		this.teamName = teamName;
	}
	
	public FootballCoach() {
		System.out.println("FootballCoach : Inside constructor");
	}
	
	public void setFortuneTeller(FortuneTeller fortuneTeller) {
		System.out.println("FootballCoach : Inside setter - setFortuneTeller");
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
