package ex01;

/*
     	스레드 (thread)
     	1. 자바의 세부 작업 단위입니다.
     	2. 생성 방법 (택 1)
     	   1) Thread 클래스를 상속 받습니다. (extends Thread)
     	   2) Runnable 인터페이스를 구현합니다. (implements Runnable)
     	3. 기본 규칙
     	   1) run() 메소드 : 스레드의 작업을 작성하는 메소드입니다. 오버라이드 해서 사용합니다.
     	   2) start() 메소드 : 스레드를 실행하는 메소드입니다. run() 메소드를 호출하지 않습니다.
 */

public class Person extends Thread {

	// field
	private String name;

	// constructor
	public Person(String name) {
		super();
		this.name = name;
	}

	// method
	public void eat() {
		System.out.println(name + "이(가) 먹는 중입니다.");
	}

	@Override
	public void run() {  // 스레드가 동작시키는 메소드 : 알아서 run()이 실행됩니다. (호출하지 않아도.)
		for (int i = 0; i < 3; i++) {
			eat();
		}
	}
	
	
	
	
	
}
