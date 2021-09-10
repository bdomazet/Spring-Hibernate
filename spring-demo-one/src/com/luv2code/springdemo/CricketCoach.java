package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	//no args constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no args constructor");
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowlong for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
