package ex01_random;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// 2. UpDown게임
		// 1 ~ 10000 사이의 난수 발생되면 사용자가 해당 난수를 맞히는 게임
		// 입력 : 5000
		// Up
		// 입력 : 7500
		// Down
		// 입력 : 7499
		// 정답. 총 3번만에 정답
		
		// 사용자 입력  :스캐너
		Scanner sc = new Scanner(System.in);
		// 1 ~ 10000 사이의 난수 발생
		int random = (int)(Math.random()*10000) + 1;
		
		// 입력범위 체크
		int top = 10000;
		int bottom = 1;
		
		// 무한반복문
		   // 반복문 카운트
		int count = 0;
		
		while (true) {
			
			// 입력
			System.out.print("입력 : ");
			int num = sc.nextInt();
			
			// 입력 횟수 카운트
			count++;
			
			
			//업 & 다운
			if(num < random) {
				System.out.println("Up");
				bottom = num +1; // 범위 안내 
			} else if (num > random) {
				System.out.println("Down");
				top = num -1;    // 범위 안내 
			} else {
				System.out.println("정답.");
				break;
			}
			
			// 입력 범위 체크
			if (num > top || num < bottom) {
				System.out.println(bottom + " ~ " + top + " 범위를 입력하세요.");
				continue;
			}
		}
		
		System.out.println("정답 : "+ random +", "+"총 "+count +"번 만에 정답");
		
		
		sc.close();
		
		
		
		
	}
}
