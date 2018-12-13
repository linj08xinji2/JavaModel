package observer2;

/**
 * ����Ĺ۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 *
 */
public class ConcreteObserver implements Observer {
	// �۲��ߵ�����
	private String observerName;
	// ��������
	private String remindThing;
	// ��������
	private String weatherContext;

	/**
	 * ��ȡĿ�����״̬ͬ�����۲��ߵ�״̬��
	 */
	@Override
	public void update(Subject subject) {
		weatherContext = ((ConcreteWeatherSubject) subject).getWeatherContext();
		System.out.println(observerName+"�յ���"+weatherContext+","+remindThing);
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

	
	

	
	
}
