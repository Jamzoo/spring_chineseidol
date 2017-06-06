package chineseIdol;

public class Juggler implements Performer {
	private int balls=3;
	
	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public Juggler(int balls) {
		super();
		this.balls = balls;
	}

	public Juggler() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		
	}

}
