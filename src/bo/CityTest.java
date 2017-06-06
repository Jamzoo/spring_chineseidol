package bo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityTest {
	private City chosenCity;
	private List<City> bigCities;
	private List<City> aBigCity;
	
	public City getChosenCity() {
		return chosenCity;
	}

	public void setChosenCity(City chosenCity) {
		this.chosenCity = chosenCity;
	}

	public List<City> getBigCities() {
		return bigCities;
	}

	public void setBigCities(List<City> bigCities) {
		this.bigCities = bigCities;
	}

	public List<City> getaBigCity() {
		return aBigCity;
	}

	public void setaBigCity(List<City> aBigCity) {
		this.aBigCity = aBigCity;
	}
	
	@Override
	public String toString() {
		return "CityTest [chosenCity=" + chosenCity + ", bigCities=" + bigCities + ", aBigCity=" + aBigCity + "]";
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bo/city.xml");
		CityTest test =(CityTest)ctx.getBean("cityTest");	
		System.out.println(test);
	}
}
