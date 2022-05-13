package jp.co.axiz.app;

public class CardGameApp extends GameApp {
	public CardGameApp(String item) {
		super(item);  
		super.setplaytime(5);
	}

	public CardGameApp() {
		super();
	}
	
	protected String play() {
		String play = "ババ抜きを行います";
		return play;
	}
	


}
