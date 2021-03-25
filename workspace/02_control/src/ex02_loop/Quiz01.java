package ex02_loop;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
 
		// 1. 퀴즈 맞히기
		// 맞힐때까지 계속 물어보는 퀴즈입니다.
		// 대한민국의 수도는 ?   => 서울 OR seoul
		// 정답입니다.
		// 대한민국의 수도는 ?   => 
		// 오답입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		// 스코프 영역 :  {  } 안의 영역
//		String city = "";   // 먼저 선언을 해주어야 한다.
		String city = null; // **String의 초기화 방법 2가지!
		do {
			
			if (city != null) { System.out.println("오답입니다.");}

			System.out.print("서울의 수도는 ? : ");
			city = sc.next();
			
		} while (!city.equals("서울") && !city.equalsIgnoreCase("seoul") );  // 틀리면 계속 물어본다. (not : ! 이 필요한 상황)

		System.out.println("정답입니다.");
		
		sc.close();
		
		
		
		
		
	}
}
