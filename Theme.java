package observer;

import java.util.ArrayList;
import java.util.List;

public class Theme implements Observable {
	
	private List<Observer> observers;
	private String theme;

	public Theme() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void follow (Observer observer) {
	this.observers.add(observer);
	observer.setTheme(this);

	}

	@Override
	public void unfollow(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void noticeObservers() {
		for(Observer observer:this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
		this.noticeObservers();
		
	}
	
}
