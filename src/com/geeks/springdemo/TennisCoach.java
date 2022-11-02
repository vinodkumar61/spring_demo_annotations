package com.geeks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volly";
	}
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
