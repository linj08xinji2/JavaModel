package factory.method;

public class SendFactory {
   // ��ͨ����ģʽ�����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
	/*public Sender product(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("��������ȷ������!");
			return null;
		}
	}*/

	 // �����������ģʽ���Ƕ���ͨ��������ģʽ�ĸĽ�������ͨ��������ģʽ�У�������ݵ��ַ�������
	 // ������ȷ�������󣬶������������ģʽ���ṩ��������������ֱ𴴽�����
	/*public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}*/
	
	// ��̬��������ģʽ��������Ķ����������ģʽ��ķ�����Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü���
	
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public  static Sender produceSms(){
		return new SmsSender();
	}
}
