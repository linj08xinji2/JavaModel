package adapter;

/**
 * ���������ģʽ����ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ�� 
 * ����һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ��ɡ�
 * 
 * �����������ģʽ����ϣ����һ������ת����������һ���½ӿڵĶ���ʱ��
 * ���Դ���һ��Wrapper�࣬����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ������С�
 * 
 * �ӿڵ�������ģʽ������ϣ��ʵ��һ���ӿ������еķ���ʱ�����Դ���һ��������Wrapper��
 *  ʵ�����з���������д������ʱ�򣬼̳г����༴�ɡ�
 * 
 *
 */
public class WrapperTest {

	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}
}