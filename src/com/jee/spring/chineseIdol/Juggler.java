package com.jee.spring.chineseIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Juggler implements Performer {
	private int balls = 3;
	
	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}
	
	public Juggler() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Juggler(int balls) {
		super();
		this.balls = balls;
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("JUGGLING"+balls+"BALLS");
		
	}
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/jee/spring/chineseIdol/chinese-idol.xml");
		Performer performer=(Performer)ctx.getBean("–°¿Ó");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
