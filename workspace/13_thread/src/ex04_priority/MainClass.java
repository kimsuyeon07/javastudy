package ex04_priority;

// 우선순위

public class MainClass {

	public static void main(String[] args) {

		// 스레드의 우선 순위 (1 ~ 10 단계로 순위를 매길 수 있다.)
		System.out.println("가장 낮은 우선 순위  : " + Thread.MIN_PRIORITY);
		System.out.println("중간 우선 순위  : " + Thread.NORM_PRIORITY);
		System.out.println("가장 높은 우선 순위  : " + Thread.MAX_PRIORITY);
		
		
		
		// Thread 생성
		Thread homework = new Thread (new Homework());
		Thread watchTV = new Thread (new WatchTV());
		
		
		// Homework의 우선순위를 높인다.
		// watchTV의 우선순위를 낮춘다.
		homework.setPriority(Thread.MAX_PRIORITY);
		watchTV.setPriority(Thread.MIN_PRIORITY);
		// 스레드 시작 
		watchTV.start();
		homework.start();
		
		// ** 
		// 확률로 높여놓은 것 뿐 
		// => 무조건 우선순위가 높은 homework가 먼저 나오지 않는다.
		
		
		
		
		
		
	}
}
