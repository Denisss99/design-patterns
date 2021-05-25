package observer;

public interface Observable {
	
	void follow (Observer observer);
	void unfollow (Observer observer);
	
    void  noticeObservers();
    
    String getUpdate();

}
