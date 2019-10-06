package com.abhishek.springdemo;

public class FortuneTeller implements Fortune {
	
	@Override
	public String getFortuneAdvice() {
		String[] fortunes = new String[3];
		fortunes[0] = "Today is your lucky day";
		fortunes[1] = "Today is not your lucky day";
		fortunes[2] = "You will die today";
		int i = (int) (Math.random()*(3))+1;
		return fortunes[i-1];
	}

}
