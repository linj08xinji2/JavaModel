package template.method2;

/**
 * 
 * 抽象基类，为所有子类提供一个算法框架
 *
 * 提神饮料
 */
public abstract class RefreshBeverage {

	/**
	 * 制备饮料的模板方法 封闭了所有子类共同遵循的算法框架
	 */
	public final void prepareBeverageTemplate() {
		// 步骤1 将水煮沸
		boilWater();
		// 步骤2 泡制饮料
		brew();
		// 步骤3 将饮料倒入杯中
		pourInCup();
		if(isCustomerWantCondiments()){
			// 步骤4 加入调味料
			addCondiments();
		}
	}

	/**
	 * Hook,钩子函数，提供 一个默认或空的实现
	 * 具体的子类可以自行决定是否挂勾以及如何挂钩
	 * 询问用户是否加入调料
	 */
	protected boolean isCustomerWantCondiments() {
		return true;
	}

	// 基本方法，将水煮沸
	private void boilWater() {
		System.out.println("将水煮沸");
	}

	// 抽象基本方法 泡制饮料
	protected abstract void brew();

	// 基本方法，将饮料倒入杯中
	private void pourInCup() {
		System.out.println("将饮料倒入杯中");
	}

	// 抽象基本方法 加入调味料
	protected abstract void addCondiments();
}
