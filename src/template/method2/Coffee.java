package template.method2;

public class Coffee extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("用沸水冲泡咖啡");
	}

	@Override
	protected void addCondiments() {
		System.out.println("往咖啡中加入牛奶");
	}

    
}
