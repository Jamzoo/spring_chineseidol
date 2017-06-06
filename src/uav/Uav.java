package uav;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import bo.CityTest;
@Component
public class Uav {
	@Value("全球鹰")
	private String type;
	@Override
	public String toString() {
		return "Uav [type=" + type + "]";
	}

	/*@Autowired
	//@Qualifier("m")//缩小bean的选取范围
	@Qualifier("sample")*/
	@Inject
	private IMissile missile;
	
	public IMissile getMissile() {
		return missile;
	}

	public void setMissile(IMissile missile) {
		this.missile = missile;
	}
	
	public Uav(IMissile missile) {
		super();
		this.missile = missile;
	}

	public Uav() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void attack() {
		// TODO Auto-generated method stub
		missile.fire();
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("uav/uav.xml");
		Uav uav1=(Uav) ctx.getBean("uav");
		uav1.attack();
		System.out.println(uav1);
	}
}
