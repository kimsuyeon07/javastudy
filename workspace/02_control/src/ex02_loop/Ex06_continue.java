package ex02_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
 
		// continue문
		// 1. loop문으로 되돌아가서 다시 실행합니다.
		// 2. continue문 이후의 코드를 실행하지 않기 위해서 사용.


		/* 
		int n = 1;
		while (n <= 10) {
			if(n % 2 == 1) {
				System.out.print(n + " ");
			}
			n++;
		}
		*/
		
		// 1. while문 버전
		int n = 1;
		while (n <= 10) {
			if(n % 2 == 0) { // 짝수는 while문으로 돌려보냅니다.
				n++;
				continue;
			}
			System.out.print(n + " ");
			n++;
		}
		
		
		System.out.println(); //줄바꿈
		
		// 2. for문 버전 (가독성이 좋다.)
		for (int num = 1 ; num <= 10 ; num++) {
			if ( num % 2 == 0) { // 짝수는 for문으로 돌려보낸다. (출력하지 않겠다.)
				continue;
			}
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		
		// 문제. 소원을 3개 들어준다.
		// 안되는 소원은 "로또당첨" / 나머지는 모두 들어준다.
		
		Scanner sc = new Scanner(System.in);
		
		int score = 1; 
		String wishList = "";
		while (true) {
			// 3가지 소원을 말했다.
			if (score > 3) {
				System.out.println("3가지 소원을 말했습니다.");
				break;
			}
			// Scanner : 소원을 말해보세요.
			System.out.print("소원을 말해보세요 : ");
			String wish = sc.next();
			
			// 소원하나를 들어주었다.
			
			// "로또당첨"은 들어줄 수 없다.
			if (wish.equals("로또당첨")) {
				System.out.println("소원을 들어줄 수 없습니다.");
				continue;
			}
			// 3가지 소원을 나열한 변수 생성
			wishList += wish;
			// 횟수 추가 변수
			score++;
			
		}
		System.out.println("당신의 소원은 : " + wishList + " 입니다.");
		
		sc.close();
		
				
		
	}
}
