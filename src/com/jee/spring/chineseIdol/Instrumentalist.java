package com.jee.spring.chineseIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Instrumentalist() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("Playing "+song+" : ");
		instrument.play();
	}
	public static void main(String[]args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jee/spring/chineseIdol/chinese-idol.xml");
		Performer p = (Performer)ctx.getBean("ะกอ๕");
		try {
			p.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	
}
