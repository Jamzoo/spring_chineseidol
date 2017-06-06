package chineseIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uav.Uav;
//声明这个类是配置类
@Configuration
public class ChineseIdolConfig {
	@Bean//加了注解以后 这个bean已近注册进入上下文 只注册一次
	public Performer 小李(){
		return new Juggler();
	}
	@Bean
	public Performer 小李10(){
		return new Juggler(10);
		
	}
	@Bean
	public Instrument instrument(){
		return new Piano();
	}
	public Performer 小张(){
		Instrumentalist 小张=new Instrumentalist();
		小张.setSong("memory");
		小张.setInstrument(instrument());
		return 小张;
	}
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chineseIdol/uav.xml");
		ChineseIdolConfig config = new ChineseIdolConfig();
		//ChineseIdolConfig config = (ChineseIdolConfig) ctx.getBean("config");
		config.小李().perform();
		//config.小李10().perform();
		//config.小张().perform();
	}

}
