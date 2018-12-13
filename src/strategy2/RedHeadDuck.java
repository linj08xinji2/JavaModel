package strategy2;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		super();
		super.setFlyingStrategy(new FlyWithWin());
	}

	@Override
	public void display() {
		 System.out.println("neck is red!!!");
	}

}
