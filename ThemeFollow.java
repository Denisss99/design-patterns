package observer;

public class ThemeFollow implements Observer {
	
	private String name;
	private Observable theme;

	public ThemeFollow(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.theme == null) {
			System.out.println(this.getName()+ "has not theme set ");
			return;

		}
	String newTheme = this.theme.getUpdate();
	System.out.println(this.getName()+ "received an  update:" + newTheme);
	
	}

	@Override
	public void setTheme(Observable theme) {
		this.theme = theme;
	}

	public String getName() {
		return name;
	}

}
