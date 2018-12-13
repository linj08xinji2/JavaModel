package strategy2;

public class Test {

	public static void main(String[] args) {

		Duck greenDuck = new GreenHeadDuck();
		greenDuck.quack();
		greenDuck.display();
		greenDuck.fly();
		System.out.println("=============");
		Duck redduck = new RedHeadDuck();
		redduck.quack();
		redduck.display();
		redduck.fly();
	}

}
