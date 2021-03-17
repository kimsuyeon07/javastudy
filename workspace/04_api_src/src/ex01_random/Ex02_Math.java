package ex01_random;

public class Ex02_Math {

	public static void main(String[] args) {
 
		// Random 방법 중 : * 주로 사용하는 방법.
		
		// java.lang.Math
		
		
		// ( 0.0 <= Math.random() < 1.0 ) double타입의 범위와 동일하게 출력
		System.out.println(Math.random());  
		
		// Math.random()의 결과가 0.1보다 작을 확률은 얼마일까요? 10%
		// Math.random()의 결과가 0.2보다 작을 확률은 얼마일까요? 20%
		
		// 10% 확률로 "강화성공", 90% 확률로 "강화실패"
		if (Math.random() < 0.1) {  // => 랜덤으로 나오는 숫자가 0.1보다 작을 때 "강화성공"이 뜨게 만드는 것 (10% 확률)
			System.out.println("강화성공");
		} else {System.out.println("강화실패");}
		
		
		
		
		// Math.random()      			  : 0.0 <= random < 1.0
		// Math.random() * 3   			  : 0.0 <= random < 3.0
		// (int)(Math.random() * 3 ) 	  : 0 <= random < 3  (casting : 실수형 random에서 정수형으로 강제 형 변환)
		// (int)(Math.random() * 3 ) + 1  : 1 <= random < 4  (범위 : 1,2,3)
		
		// 일반화해서 공식처럼 활용
		// 원하는 난수의 범위
		// (int)(Math.random() * 개수 ) + 시작값 
		
		// 주사위처럼 :(int)(Math.random() * 6) + 1   : 1부터 6까지의 범위 (1,2,3,4,5,6)
		// 로또          :(int)(Math.random() * 45) + 1  : 1부터 45까지의 범위 (1,2,3, ... 45)
		
		int lotto = (int)(Math.random()*45) + 1;
		System.out.println(lotto);
		
		
		
		
	}
}
