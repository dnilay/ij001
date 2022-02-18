package com.example.model;

public class BaseBallCoach  implements Coach {
	
private final FortuneService fortuneService;

	public BaseBallCoach(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "practice back volley today";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
