package factory.method;
/**
 * 
 * ������˵������ģʽ�ʺϣ����ǳ����˴����Ĳ�Ʒ��Ҫ������
 * ���Ҿ��й�ͬ�Ľӿ�ʱ������ͨ����������ģʽ���д�����
 * �����µ�����ģʽ�У���һ�����������ַ�������
 * ������ȷ�������󣬵���������ڵڶ��֣�
 * ����Ҫʵ���������࣬���ԣ����������£�
 * ���ǻ�ѡ�õ����֡�����̬��������ģʽ��
 *
 */
public class FactoryTest {

	public static void main(String[] args) {
		// ��ͨ����ģʽ 
		/*SendFactory factory = new SendFactory();
		Sender sender = factory.product("mail");
		sender.send();*/
		
		// �����������ģʽ 
		/*SendFactory factory=new SendFactory();
	    Sender sender=	factory.produceSms();
	    sender.send();*/
	    
	    // ��̬��������ģʽ
		Sender sender=SendFactory.produceMail();
		sender.send();
	}
}