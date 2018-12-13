package observer2.java;

public class Client {

	public static void main(String[] args) {
		// 1������Ŀ��
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		// 2�������۲���
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("girlFriend");

		ConcreteObserver observerMon = new ConcreteObserver();
		observerMon.setObserverName("mymonther");
		// 3��ע��۲���
		weather.addObserver(observerGirl);
		weather.addObserver(observerMon);
		// 4��Ŀ�귢������
		weather.setContent("28�ȣ���");

	}

}
