package strategy2;

public abstract class Duck {
	/**
	 * 通用行为，由超类实现
	 */
	public void quack(){
		System.out.println("gagaga");
	}
	
	/**
	 * 外观，声明为abstrac,由子类去实现
	 */
	public abstract void display();
	
	private FlyingStrategy flyingStrategy;
	
	public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}

	public void fly(){
		flyingStrategy.performFly();
	}
	
}
