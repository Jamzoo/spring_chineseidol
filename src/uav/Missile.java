package uav;

import org.springframework.stereotype.Component;

@Component
public class Missile implements IMissile {

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("fire....");
	}

}
