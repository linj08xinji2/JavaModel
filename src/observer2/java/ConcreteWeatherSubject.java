package observer2.java;

import java.util.Observable;

//  ����Ŀ�����ʵ����
public class ConcreteWeatherSubject extends Observable {
	// �����������
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		// ����������ˣ���Ҫ֪ͨ���еĹ۲���
		// ע����֪֮ͨǰ������java�е�Observerģʽʱ��������仰������
		this.setChanged();
		// Ȼ������֪ͨ���������������Ƶķ�ʽ
//		this.notifyObservers(content);
		// ���ķ�ʽ
		this.notifyObservers();
	}

}
