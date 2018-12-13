package observer2;

public class Client {

	public static void main(String[] args) {
		// 1������Ŀ��
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		// 2�������۲���
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("girlFriend");
		observerGirl.setRemindThing("���");

		ConcreteObserver observerMon = new ConcreteObserver();
		observerMon.setObserverName("mymonther");
		observerMon.setRemindThing("shopping");
		// 3��ע��۲���
		weather.attach(observerMon);
		weather.attach(observerGirl);
		// 4��Ŀ�귢������
		weather.setWeatherContext("�������ʣ�����");

	}

}
