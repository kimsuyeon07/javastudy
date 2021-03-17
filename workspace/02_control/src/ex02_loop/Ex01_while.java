package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
 
		// while문 (반복문)
		// 언제 끝날지 모를때 사용한다. ( -> 반복 횟수가 정해지지 않았을 때 )
		
//		// 무한루프 만들기
//		while (true) {
//			System.out.println("무한루프입니다.");
//		}
		
		// 1 ~ 10 출력
		int n = 1;
		while (n <= 10) { 
			System.out.println(n++);
		}
		
		System.out.println();  // 줄바꿈
		
		n = 10 ;
		while (n >= 1) {
			System.out.println(n--);
		}
		
		
		// -----------------------------------
		// 'A' ~ 'Z' 사이를 계속 입력 받는 프로그램
		//  코드값 => 'A' : 65  ~ 'Z' : 90
		// 대문자가 입력되지 않으면 종료
		Scanner sc = new Scanner(System.in);
		
		char ch = 'A';  // while문에서 최초의 통과 조건을 위해 리터럴값을 적어준다.
		
		while (ch >= 'A' && ch <= 'Z') {     // (ch >= 65 && ch <= 90) {  (연산 시, 알아서 코드값으로 바뀌어 진행되기 대문에 굳이 코드값을 적을 필요 없음.)
			System.out.print("대문자 입력 : ");
			ch = sc.next().charAt(0);
		}
		
		
		// ---------------------------------
		// Quiz
		// 입력 받은 정수를 모두 더해줍니다.
		// 0이상은 모두 더해주고, 음수가 입력되면 그만합니다.
		// 합계 출력
		
		int num = 0;  // 최초 while문 진입 용도.  --> 입력받을 변수 선언.
		int sum = 0;
		
		while(num >= 0) {
			System.out.print("양수 입력 : ");
			num = sc.nextInt();
			// sum : 합계
			sum += num;  
			
		}
		sum -= n;  // n이 음수일 때 까지 처리되어서, 마지막의 입력한 음수는 '-'준다.
		System.out.println("입력받은 정수의 합계 : " + sum);
		
		
		
		sc.close();
		
		
		
		
	}
}
