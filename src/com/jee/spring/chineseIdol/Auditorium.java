package com.jee.spring.chineseIdol;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Auditorium {
	public void turnOnLight() {
		// TODO Auto-generated method stub
		System.out.println("trun on the light");
	}
	public void turnOffLight() {
		// TODO Auto-generated method stub
		System.out.println("trun off the light");
	}
	public static void main(String[]args){
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/jee/spring/chineseIdol/chinese-idol.xml");
		Auditorium au = (Auditorium)ctx.getBean("auditorium");
		ctx.registerShutdownHook();
	}
}
