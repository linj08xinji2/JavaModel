package observer2;

/**
 * �۲��߽ӿڣ�����һ�����µĽӿڸ���Щ��Ŀ�귢���ı��ʱ��֪ͨ�Ķ���
 *
 */
public interface Observer {

	/**
	 * ���½ӿ�
	 * @param subject ����Ŀ����󣬷����ȡ��Ӧ��Ŀ������״̬
	 */
	public void update(Subject subject);
}
