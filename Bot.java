package mediator;

public class Bot {
	
private static Bot instance;
	
	public Bot() {
		
	}
	
	
	public static Bot getInstance() {
		
		if(instance == null) {
			instance = new Bot();
		}		
		
		return instance;
		
	}
	
	public boolean messageCheck(String message) {
		
		if(message.contains("Cat")) {
			
			System.out.println("This word: " + message + "is not allowed.");
			System.out.println("User removed");
			return false;
			
		}
		
		return true;
	}
	
}