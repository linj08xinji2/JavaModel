package strategy2;

public class FlyNoWay implements FlyingStrategy {

	@Override
	public void performFly() {
    System.out.println("cann't fly");		
	}

}
