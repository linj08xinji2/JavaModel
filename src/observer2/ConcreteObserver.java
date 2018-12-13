package observer2;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保存一致
 *
 */
public class ConcreteObserver implements Observer {
	// 观察者的名字
	private String observerName;
	// 提醒内容
	private String remindThing;
	// 天气内容
	private String weatherContext;

	/**
	 * 获取目标类的状态同步到观察者的状态中
	 */
	@Override
	public void update(Subject subject) {
		weatherContext = ((ConcreteWeatherSubject) subject).getWeatherContext();
		System.out.println(observerName+"收到："+weatherContext+","+remindThing);
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
