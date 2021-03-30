package ex05_synchronized;

public class MainClass {

	public static void main(String[] args) {

		// critical section : 치명적인 구역 (공유영역)
		// ↓
		// thread1 / thread2 는 다른 객체 : 서로 각각의 작업을 진행
		// => 두개의 객체가 같은 작업을 서로 진행하는 거라면, 서로 조금씩 진행하고 넘겨주고를 반복
		//    1) wait / notify 가 동시에 진행 [동기화]
		
		
		
		// 청소기 1대
		Dyson v11 = new Dyson();
		
		// 엄마, 아빠 (스레드 2개)
		Mama mama = new Mama();
		Papa papa = new Papa();
		
		// 엄마 청소 시작
		mama.setDyson(v11);
		mama.start();
		// 아빠 청소 시작
		papa.setDyson(v11);
		papa.start();
		 
		
		
	}
}
