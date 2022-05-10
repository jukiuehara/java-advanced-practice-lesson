package app;

public class CardGameApp extends GameApp{
	public CardGameApp(String item) {
	super(item);	
	}
	public CardGameApp() {
		super();
	}
		public String start(String name) {
		return (name+"さんと"+this.item+"でゲームを開始します。ババ抜きを行います。");
	}
}
