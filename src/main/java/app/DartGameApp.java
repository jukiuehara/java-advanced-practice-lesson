package app;

public class DartGameApp extends GameApp {
	public DartGameApp(String item) {
		super(item);
		super.setplaytime(10);
	}

	public DartGameApp() {
		super();
	}
	
	protected String play() {
		String play = "ダーツでゲームを開始します。10回投げて合計点を競います。";
		return play;
	}

}
