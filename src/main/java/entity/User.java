package entity;

/**
 * Userクラス
 */
public class User {

    // フィールド
	public String userId;
	public String userName;
	public int age;
	
	public User() {
		
	}
	public User(String userId,String userName,int age) {
		this.userId = userId;
		this.userName = userName;
		this.age = age;
	}
	public String returnUserInfo() {
		return ("ユーザーID："+this.userId+"、ユーザ名："+this.userName+"、年齢："+this.age);
	}
    /**
     * コンストラクタ(引数なし)
     */


    /**
     * コンストラクタ(引数3つ)
     */


    /**
     * ユーザー情報を取得するメソッド
     */

}
