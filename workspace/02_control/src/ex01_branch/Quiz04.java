package ex01_branch;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
 
		// 문제4. ) switch문으로, 단계를 숫자로 입력 받아 구분 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단계 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.print("기");  // break; 가 없다면 switch문이 끝나지 않아서 'break'를 만날 때까지 진행됨.
		case 2:
			System.out.print("숭");
		case 3:
			System.out.print("전");
		case 4:
			System.out.print("결");
			break;
		default :
			System.out.println("알 수 없음.");

		}
		
		
		sc.close();
		
	}
}
