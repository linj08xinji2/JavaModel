package singleton;
public class SingletonPatternDemo {
   public static void main(String[] args) {

      //���Ϸ��Ĺ��캯��
      //����ʱ���󣺹��캯�� SingleObject() �ǲ��ɼ���
      //SingleObject object = new SingleObject();

      //��ȡΨһ���õĶ���
	   Singleton object = Singleton.getInstance();

      //��ʾ��Ϣ
      object.showMessage();
   }
}