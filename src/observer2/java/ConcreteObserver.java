package observer2.java;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    // 观察者名称
	private String observerName;
	
	@Override
	public void update(Observable o, Object arg) {
	// 推的方式
//		System.out.println(observerName+"收到了消息，目标推送过来的是"+arg);
		//  拉的方式
		System.out.println(observerName+"收到了消息，拉的内容是："+
		((ConcreteWeatherSubject)o).getContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	
	
}
