package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
 
		// Random : 난수 발생 (게임에서 많이 사용된다.)
		// java.util.Random (Package)
		Random random = new Random();
		
		// 1. int형 난수
		int rand1 = random.nextInt();    // int 범위 중 하나
		int rand2 = random.nextInt(40);  // 10개중 하나 (0 ~ : 0에서부터 9까지의 정수 중 하나)
		
		System.out.println(rand1); 
		System.out.println(rand2);

		
		// 2. double형 난수
		double rand3 = random.nextDouble();  // ( 0 <= 난수 < 1 ) : 0.99999999...까지
		System.out.println(rand3);			 // ( 0% <= 난수 < 100% ) : 확률의 이야기
		
		// 3. 
		
		
		
		
		
		
	}
}
