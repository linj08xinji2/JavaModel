package template.method2;

public class Tea extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("用85度热水泡茶15分钟");
	}

	@Override
	protected void addCondiments() {
		System.out.println("往茶中加入柠檬");
	}

	/**
	 * 子类通过覆盖的形式选择挂载钩子函数
	 */
	@Override
	protected boolean isCustomerWantCondiments() {
		return false;
	}
}
