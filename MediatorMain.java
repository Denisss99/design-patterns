package mediator;

public class MediatorMain {

	public static void main(String[] args) {


		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Marto");
		User user2 = new ChatUser(chat, "Denis");
		User user3 = new ChatUser(chat, "Ralica");
		
		
		user2.send("Hi,friends ");
		user3.send("addBot ");
		user1.send("Cat ");
		user3.send("Oh No! ");
	}

}
