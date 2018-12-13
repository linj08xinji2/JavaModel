package strategy2;

public abstract class Duck {
	/**
	 * ͨ����Ϊ���ɳ���ʵ��
	 */
	public void quack(){
		System.out.println("gagaga");
	}
	
	/**
	 * ��ۣ�����Ϊabstrac,������ȥʵ��
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
