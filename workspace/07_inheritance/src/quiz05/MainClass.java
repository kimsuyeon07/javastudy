package quiz05;

public class MainClass {

	public static void main(String[] args) {

		
		Terran[] terrans = new Terran[10];
		
		terrans[0] = new Marine();   // == terrans.add(new Marine());
		terrans[0] = new Firebat();  // == terrans.add(new Firebat());
		terrans[0] = new Tank();     // == terrans.add(new Tank());
		
		Bunker bunker = new Bunker();
		bunker.add(new Marine());
		bunker.add(new Firebat());
//		bunker.add(new Tank());  // 불가능
		
		
		// 클래스 상속 관계 확인 하는 연습.
		// 
		
		
	}
}
