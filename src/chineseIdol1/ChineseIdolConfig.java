package chineseIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class ChineseIdolConfig {
	@Bean
	public Performer С��(){
		return new Juggler();
	}
	@Bean
	public Performer С��10(){
		return new Juggler(10);
	}
	@Bean
	public Instrument instrument(){
		return new Piano();
	} 
	public Performer С��(){
		Instrumentalist С�� = new Instrumentalist();
		С��.setSong("memory");
		С��.setInstrument(instrument());
		return С��;
	}
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chineseIdol/uav.xml");
//		ChineseIdolConfig config = new ChineseIdolConfig();
		ChineseIdolConfig config = (ChineseIdolConfig)ctx.getBean("config");
		config.С��().perform();
		config.С��10().perform();
		config.С��().perform();
		Performer С�� = config.С��();
		Performer С��2 = config.С��();
		System.out.println(С��==С��2);
	}

}
