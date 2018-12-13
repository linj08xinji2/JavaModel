package observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������֪���۲����Ĺ۲��ߣ����ṩ���ӡ�ɾ���۲��ߵĽӿ�
 */
public class Subject {
	// ����ע��۲��߶���
	private List<Observer> observers = new ArrayList<Observer>();

	// ����
	public void attach(Observer observer) {
		observers.add(observer);
	}

	// ɾ��
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	// ֪ͨ����ע��۲��߶���
	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
