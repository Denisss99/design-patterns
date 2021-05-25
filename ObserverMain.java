package observer;

public class ObserverMain {

	public static void main(String[] args) {
		Theme theme = new Theme();
		
		Observer obs1 = new ThemeFollow("Reader 01");
		Observer obs2 = new ThemeFollow("Reader 02");
		Observer obs3 = new ThemeFollow("Reader 03");
		
		theme.follow(obs1);
		theme.follow(obs2);
		theme.follow(obs3);
		
		theme.setTheme("Breaking news: Covid 19 strikes");
		
		theme.setTheme("Elections in Bulgaria 2021");

	}

}
