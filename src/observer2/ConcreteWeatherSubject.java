package observer2;

/**
 * ����Ŀ����󣬸�����йص�״̬���뵽��Ӧ�Ĺ۲��߶�����
 *
 */
public class ConcreteWeatherSubject extends Subject {

	// Ŀ�����״̬
	private String weatherContext;

	public String getWeatherContext() {
		return weatherContext;
	}

	public void setWeatherContext(String weatherContext) {
		this.weatherContext = weatherContext;
		this.notifyObservers();  //  �ص�
	}

	
	
	
}
