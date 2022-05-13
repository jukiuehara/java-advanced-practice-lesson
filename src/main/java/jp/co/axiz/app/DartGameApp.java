package jp.co.axiz.app;

public class DartGameApp extends GameApp {
	public DartGameApp(String item) {
		super(item);
	}

	public DartGameApp() {
		super();
	}
	
	public String play() {
		String play = "ダーツでゲームを開始します。10回投げて合計点を競います。";
		return play;
	}

}
