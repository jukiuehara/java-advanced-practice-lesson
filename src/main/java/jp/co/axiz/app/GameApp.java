package jp.co.axiz.app;
	public abstract class GameApp implements  App{
	public String item;
	public GameApp() {
		super();
		this.item = "";
	}
	public GameApp(String item) {
		this.item=item;
	}
	public String start(String name) {
		return (name+"さんと"+item+"でゲームを開始します。"+play());

	}
	
	public String play() {
		String play = "";
		return play;
	}
}
