package com.jee.spring.chineseIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RidableJuggler extends Juggler {
	private Ridable ridable;	

	public RidableJuggler(Ridable ridable) {
		super();
		this.ridable = ridable;
	}


	public RidableJuggler(int balls,Ridable ridable) {
		super(balls);
		this.ridable = ridable;
		// TODO Auto-generated constructor stub
	}

	public RidableJuggler() {
		super();
	}


	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("while riding.....");
		ridable.ride();
	}
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/jee/spring/chineseIdol/chinese-idol.xml");
		Performer performer = (Performer) ctx.getBean("п║уе");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
