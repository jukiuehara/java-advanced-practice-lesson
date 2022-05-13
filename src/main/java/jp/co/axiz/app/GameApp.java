package jp.co.axiz.app;
	public abstract class GameApp implements  App{
	private String item;
	private int playtime;
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
	
	protected String play() {
		String play = "";
		return play;
	}

	public int getplaytime() {
		return  this.playtime;
	}

	public void setplaytime(int playtime) {
		this.playtime = playtime;
	}

}
