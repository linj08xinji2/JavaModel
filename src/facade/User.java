package facade;

/**
 * �������û��Computer�࣬��ô��CPU��Memory��Disk����֮�佫���໥����ʵ����������ϵ��
 * ������������ص��������޸�һ���࣬���ܻ������������޸ģ��ⲻ��������Ҫ�����ģ�
 * ����Computer�࣬����֮��Ĺ�ϵ��������Computer���
 * ���������˽�������ã��⣬�������ģʽ��
 * @author ����Ա
 *
 */
public class User {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}