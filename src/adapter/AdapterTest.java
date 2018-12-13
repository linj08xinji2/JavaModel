package adapter;
/**
 * 
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		/**
		 * 类的适配器模式: 核心思想就是：有一个Source类，拥有一个方法，待适配，
		 * 目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
		 */
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
		System.out.println("=========");
		/**
		 * 对象的适配器模式 基本思路和类的适配器模式相同，只是将Adapter类作修改，
		 * 这次不继承Source类，
		 * 而是持有Source类的实例，以达到解决兼容性的问题
		 */
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();

	}

	
	
}
