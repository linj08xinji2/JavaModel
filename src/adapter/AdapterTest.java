package adapter;
/**
 * 
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		/**
		 * ���������ģʽ: ����˼����ǣ���һ��Source�࣬ӵ��һ�������������䣬
		 * Ŀ��ӿ�ʱTargetable��ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
		 */
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
		System.out.println("=========");
		/**
		 * �����������ģʽ ����˼·�����������ģʽ��ͬ��ֻ�ǽ�Adapter�����޸ģ�
		 * ��β��̳�Source�࣬
		 * ���ǳ���Source���ʵ�����Դﵽ��������Ե�����
		 */
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();

	}

	
	
}
