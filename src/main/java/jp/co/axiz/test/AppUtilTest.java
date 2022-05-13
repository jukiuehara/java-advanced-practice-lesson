package jp.co.axiz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.Util.AppUtil;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartGameApp;

class AppUtilTest {
	CardGameApp cg = new CardGameApp();
	DartGameApp dg = new DartGameApp();
    ClockApp c = new ClockApp();

	@Test
	void isGameAppデータパターンNo1() {
		boolean result = AppUtil.isGameApp(cg);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void isGameAppデータパターンNo2() {
		boolean result = AppUtil.isGameApp(dg);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void isGameAppデータパターンNo3() {
		boolean result = AppUtil.isGameApp(c);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void isCardGameAppデータパターンNo1() {
		boolean result = AppUtil.isCardGameApp(cg);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void isCardGameAppデータパターンNo2() {
		boolean result = AppUtil.isCardGameApp(dg);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void isCardGameAppデータパターンNo3() {
		boolean result = AppUtil.isCardGameApp(c);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void isDartGameAppデータパターンNo1() {
		boolean result = AppUtil.isDartGameApp(cg);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void isDartGameAppデータパターンNo2() {
		boolean result = AppUtil.isDartGameApp(dg);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void isDartGameAppデータパターンNo3() {
		boolean result = AppUtil.isDartGameApp(c);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void isClockAppデータパターンNo1() {
		boolean result = AppUtil.isClockApp(cg);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void isClockAppデータパターンNo2() {
		boolean result = AppUtil.isClockApp(dg);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void isClockAppデータパターンNo3() {
		boolean result = AppUtil.isClockApp(c);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void getAppNameデータパターンNo1() {
		String result = AppUtil.getAppName(cg);
		String expected = "ゲーム：カード";
		assertEquals(expected,result);
	}
	@Test
	void getAppNameデータパターンNo2() {
		String result = AppUtil.getAppName(dg);
		String expected = "ゲーム：ダーツ";
		assertEquals(expected,result);
	}
	@Test
	void getAppNameデータパターンNo3() {
		String result = AppUtil.getAppName(c);
		String expected = "時計";
		assertEquals(expected,result);
	}

}
