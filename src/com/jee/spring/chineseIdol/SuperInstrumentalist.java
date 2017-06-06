package com.jee.spring.chineseIdol;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SuperInstrumentalist implements Performer {
	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	public SuperInstrumentalist() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		for(Instrument instrument:instruments){
			instrument.play();
		}
	}

	public static void main(String[]args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/javaee/spring/chineseIdol/chinese-idol.xml");
		Performer p = (Performer)ctx.getBean("Сǿ");
		try {
			p.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
}
