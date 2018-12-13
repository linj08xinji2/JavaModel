package observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供增加、删除观察者的接口
 */
public class Subject {
	// 保存注册观察者对象
	private List<Observer> observers = new ArrayList<Observer>();

	// 增加
	public void attach(Observer observer) {
		observers.add(observer);
	}

	// 删除
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	// 通知所有注册观察者对象
	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
