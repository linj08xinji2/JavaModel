package observer2.java;

public class Client {

	public static void main(String[] args) {
		// 1、创建目标
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		// 2、创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("girlFriend");

		ConcreteObserver observerMon = new ConcreteObserver();
		observerMon.setObserverName("mymonther");
		// 3、注册观察者
		weather.addObserver(observerGirl);
		weather.addObserver(observerMon);
		// 4、目标发布天气
		weather.setContent("28度！！");

	}

}
