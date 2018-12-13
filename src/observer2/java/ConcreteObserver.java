package observer2.java;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    // �۲�������
	private String observerName;
	
	@Override
	public void update(Observable o, Object arg) {
	// �Ƶķ�ʽ
//		System.out.println(observerName+"�յ�����Ϣ��Ŀ�����͹�������"+arg);
		//  ���ķ�ʽ
		System.out.println(observerName+"�յ�����Ϣ�����������ǣ�"+
		((ConcreteWeatherSubject)o).getContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	
	
}
