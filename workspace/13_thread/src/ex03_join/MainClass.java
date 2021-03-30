package ex03_join;

public class MainClass {

	public static void main(String[] args) {

		
		Calculator calc2 = new Calculator();
		Calculator calc1 = new Calculator();
		
		calc1.setFrom(1);
		calc1.setTo(500);
		calc2.setFrom(501);
		calc2.setTo(1000);

		calc1.start();
		calc2.start();
		
		
		
		// →
		// 결과 1.
		System.out.println(calc1.getResult() + calc2.getResult());
		// => 0 : calc1.addition()이 끝나고 getResult()가 호출된다는 보장이 없다.
		
		
		
		// main이 calc1 스레드와 calc2 스레드가 종료될 때까지 기다려야 합니다.
		// 스레드 종료를 기다리는 메소드 : join()
		// join() 호출은 예외처리가 필요합니다.
		
		
		
		// →
		// 결과 2. : join() + 예외처리
		try {
			calc1.join();
			calc2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(calc1.getResult() + calc2.getResult());
		
		
		
		
	}
}
