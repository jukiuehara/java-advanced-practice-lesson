package jp.co.axiz.Util;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartGameApp;
import jp.co.axiz.app.GameApp;



public class AppUtil {

	public static boolean isGameApp(App gameapp) {
		if(gameapp instanceof CardGameApp||gameapp instanceof DartGameApp||gameapp instanceof GameApp) {
			return true;
		}
		return false;
	}
	
	public static boolean isCardGameApp(App card) {
		if(card instanceof CardGameApp) {
			return true;
		}
		return false;
	}
	
	public static boolean isDartGameApp(App dart) {
		if(dart instanceof DartGameApp) {
			return true;
		}
		return false;
	}
	
	public static boolean isClockApp(App clock) {
		if(clock instanceof ClockApp) {
			return true;
		}
		return false;
	}
	
	public static String getAppName(App game) {
		String a ;
		if(isDartGameApp(game)) {
			a = "ゲーム：ダーツ";
			return a;
		}else if(isCardGameApp(game)) {
			a = "ゲーム：カード";
			return a;
		}else if(isClockApp(game)) {
		a = "時計";
		return a;
	}else {
		return null;
	}
	}
}