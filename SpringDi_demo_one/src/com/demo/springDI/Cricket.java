package com.demo.springDI;

public class Cricket implements TheCoach {

	// define a private feild for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependancy injection
	public Cricket(FortuneService thefortuneService) {

		fortuneService = thefortuneService;

	}

	@Override
	public String workout() {
		// TODO Auto-generated method stub
		return "hit a six!!!!";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune 
		return fortuneService.getFortune();
	}

}
