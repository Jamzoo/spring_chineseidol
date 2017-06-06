package chineseIdol;

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
	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try {
			System.out.println("��������");
			System.out.println("���ڹر��ֻ�");
			long start = System.currentTimeMillis();
			joinpoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("���ڹ��ƣ�ž ž ž");
			System.out.println("���ݳ���ʱ���ǣ�"+(end-start)+" ����");
		} catch (Throwable e) {
			System.out.println("����̫����ˣ�����Ҫ����Ʊ��");
		}
	}
	public static void main(String []args) throws PerformanceException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chineseIdol/chineseIdol.xml");
		Performer p = (Performer)ctx.getBean("performer");
		p.perform();
		Contestant con = (Contestant)p;
		con.receiveAward();
	}
}
