package chineseIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class ChineseIdolConfig {
	@Bean
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
		Instrumentalist 小张 = new Instrumentalist();
		小张.setSong("memory");
		小张.setInstrument(instrument());
		return 小张;
	}
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chineseIdol/uav.xml");
//		ChineseIdolConfig config = new ChineseIdolConfig();
		ChineseIdolConfig config = (ChineseIdolConfig)ctx.getBean("config");
		config.小李().perform();
		config.小李10().perform();
		config.小张().perform();
		Performer 小李 = config.小李();
		Performer 小李2 = config.小李();
		System.out.println(小李==小李2);
	}

}
