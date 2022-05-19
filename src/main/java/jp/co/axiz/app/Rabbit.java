package jp.co.axiz.app;

public class Rabbit extends Animal {
	
	public Rabbit() {
		
	}
	
	public Rabbit(String name, int age) {
		super(name,age);
	}
	
	public String introduceAge() {
		String people=null;
        switch (age) {
        case 0:
            people = "0～10代中盤";
            break;
        case 1:
        	people = "10代中盤";
            break;
        case 2:
        	people = "20代";
            break;
        case 3:
        	people = "30代";
            break;
        case 4:
        	people = "40代";
            break;
        case 5:
        	people = "50代";
            break;
        default:
        	people = "60歳以上";
            break;
        }

		return "種類はウサギです。人間でいうと"+people+"代です";
	}
	
	public String getFilePath() {
		return "C:\\work\\rabbit.txt";
	}
}