package app;
	public class GameApp{
	public String item;
	public GameApp() {
		this.item = "何か";
	}
	public GameApp(String item) {
		this.item=item;
	}
	public String start(String name) {
		return (name+"さんと"+item+"でゲームを開始します。");
	}
}
