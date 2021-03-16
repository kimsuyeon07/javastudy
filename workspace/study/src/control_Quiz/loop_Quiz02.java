package control_Quiz;

import java.util.Scanner;

public class loop_Quiz02 {

	public static void main(String[] args) {

		// 영화 평점을 입력받아서
		// ★을 출력
		// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.
		
		Scanner sc = new Scanner(System.in);
		
//		int grade = 0;
		
		
		System.out.print("평점을 입력하세요 : ");
		int grade = sc.nextInt();
		
		for(int n = 0 ; n < 6 ; n++) {
			grade++;
		}
		
//		switch (grade) {
//		case 1: 2: 3: 4: 5: ★; break;
//		default: System.out.println("평점이 없습니다."); 
//		
//		}
		
		
		
		
		
		
		
		
		
		
	}
}
