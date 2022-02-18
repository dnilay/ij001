package com.example.model;

public class CricketCoach implements Coach {
private final FortuneService fortuneService;
	

public CricketCoach(FortuneService fortuneService) {
	
	this.fortuneService = fortuneService;
}

@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "practice spin bowling today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	

}
