package ex01;

public class MainClass {

	public static void main(String[] args) {

		Person p1 = new Person("자두");
		Person p2 = new Person("스폰지밥");
		Person p3 = new Person("브래드");
		
		
		
		// 스레드는 JVM에 의해서 스케쥴링 되기 때문에 코드 작성 순서대로 동작하지 않을 수 있습니다.
		// ↓
		p1.start();  // 스레드를 호출하는 방법 : start()	
					 // 자동으로 p1의 run() 메소드를 실행합니다.
		p2.start();
		p3.start();
		 			 
		System.out.println("모두 식사가 끝났습니다.");  // 스레드 상황에서는 틀린 메시지
		// p1, p2, p3가 끝날 때까지 기다리지 않는다.
		
		
		
		
		
		
		
		
	}
}
