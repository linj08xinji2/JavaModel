package observer2;

/**
 * 具体目标对象，负责把有关的状态存入到相应的观察者对象中
 *
 */
public class ConcreteWeatherSubject extends Subject {

	// 目标对象状态
	private String weatherContext;

	public String getWeatherContext() {
		return weatherContext;
	}

	public void setWeatherContext(String weatherContext) {
		this.weatherContext = weatherContext;
		this.notifyObservers();  //  重点
	}

	
	
	
}
