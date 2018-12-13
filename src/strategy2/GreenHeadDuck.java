package strategy2;

public class GreenHeadDuck extends Duck {
	public GreenHeadDuck() {
		super();
		super.setFlyingStrategy(new FlyNoWay());
	}

	@Override
	public void display() {
      System.out.println("neck is green!!");		
	}

}
