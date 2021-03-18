package ex09_upcasting;

public class MainClass {

	public static void main(String[] args) {

		// upcasting이 없는 경우
		// => 타입이 다르다 : 커피마다 커피를 담는 컵이 다르다. 를 의미
		Espresso espresso = new Espresso("콜롬비아", 30);
		Latte latte = new Latte("인도네시아", 30, 150);
		espresso.info();
		espresso.tates();
		latte.info();
		latte.tates();
		
		System.out.println("=====================================");
		
		// upcasting을 사용한 경우
		// => 타입이 같다 : 모든 커피를 같은 컵에 담는다.     를 의미
		Coffee coffee1 = new Espresso("콜롬비아", 30);
		Coffee coffee2 = new Latte("인도네시아", 30, 150);
		coffee1.info();
		coffee1.tates();
		coffee2.info();
		coffee2.tates();
		
	}
}
