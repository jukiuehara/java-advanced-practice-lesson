package jp.co.axiz.app;

public class Cat extends Animal {
	
	public Cat() {
		
	}
	
	public Cat(String name, int age) {
		super(name,age);
	}
	
	public String introduceAge() {

	
    switch (age) {
    case 0:
    	people = "0～10代中盤";
        break;
    case 1:
    	people = "10代中盤";
        break;
    case 2:
    case 3:
    	people = "20代";
        break;
    case 4:
    case 5:
    	people = "30代";
        break;
    case 6:
    case 7:
    case 8:
    	people = "40代";
        break;
    case 9:
    case 10:
    	people = "50代";
        break;
    default:
    	people = "60歳以上";
        break;
    }
		return "種類はネコです。人間でいうと"+people+"です";
	}
	
	public String getFilePath() {
		return "C:\\work\\cat.txt";	}
	


		
}