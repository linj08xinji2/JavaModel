package observer2;

public class Client {

	public static void main(String[] args) {
		// 1、创建目标
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		// 2、创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("girlFriend");
		observerGirl.setRemindThing("逛街");

		ConcreteObserver observerMon = new ConcreteObserver();
		observerMon.setObserverName("mymonther");
		observerMon.setRemindThing("shopping");
		// 3、注册观察者
		weather.attach(observerMon);
		weather.attach(observerGirl);
		// 4、目标发布天气
		weather.setWeatherContext("天气清朗！！！");

	}

}
