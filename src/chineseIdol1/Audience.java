package chineseIdol1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Audience {
	public void takeSeats(){
		System.out.println("��������.");
	}
	public void turnOffCellPhones(){
		System.out.println("���ڹر��ֻ�.");
	}
	public void applaud(){
		System.out.println("���ڹ��ƣ�ž ž ž.");
	}
	public void demandRefund(){
		System.out.println("����̫����ˣ�����Ҫ����Ʊ��");
	}
	public static void main(String []args) throws PerformanceException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chineseIdol1/chineseIdol.xml");
		Performer p = (Performer)ctx.getBean("performer");
		p.perform();
	}
}
