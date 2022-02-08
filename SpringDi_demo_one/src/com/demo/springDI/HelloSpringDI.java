package com.demo.springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TheCoach coach=context.getBean("sport",TheCoach.class);
		System.out.println(coach.workout());
		System.out.println(coach.getDailyFortune());
		context.close();
		
		
	}

}
