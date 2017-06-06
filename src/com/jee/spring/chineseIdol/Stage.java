package com.jee.spring.chineseIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stage {
	private Stage(){
		
	};
	private static class SingletonHolder{
		static Stage instance = new Stage();
	};
	public static Stage getInstance(){
		return SingletonHolder.instance;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("演出开始了");
	}
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/jee/spring/chineseIdol/chinese-idol.xml");
		Stage Stage = (Stage) ctx.getBean("theStage");
		Stage.show();
	}
}
