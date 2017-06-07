package chineseIdol1;

public class Juggler implements Performer {
	private int balls = 3;
	
	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("JUGGLING "+balls+" BALLS");
	//	throw new PerformanceException("Ôã¸â£¬ÓÐÇé¿ö£¡");
	}

	public Juggler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Juggler(int balls) {
		super();
		this.balls = balls;
	}

}
