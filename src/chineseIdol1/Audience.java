package chineseIdol1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Audience {
	public void takeSeats(){
		System.out.println("观众入座.");
	}
	public void turnOffCellPhones(){
		System.out.println("观众关闭手机.");
	}
	public void applaud(){
		System.out.println("观众鼓掌：啪 啪 啪.");
	}
	public void demandRefund(){
		System.out.println("表演太糟糕了，我们要求退票！");
	}
	public static void main(String []args) throws PerformanceException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chineseIdol1/chineseIdol.xml");
		Performer p = (Performer)ctx.getBean("performer");
		p.perform();
	}
}
