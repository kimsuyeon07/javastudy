package control_Quiz;

import java.util.Scanner;

public class loop_Quiz02 {

	public static void main(String[] args) {
		// 영화 평점을 입력받아서
				// ★을 출력
				// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.
				
				Scanner sc = new Scanner(System.in);
				int grade = 0;
				do {
					if (grade >= 1) {System.out.println("다시 입력하세요.");}
					System.out.print("평점을 입력하세요 : ");
					grade = sc.nextInt();
				} while (1 > grade || grade > 5);  // grade가 1보다 작거나 5보다 크면 실행하겠다.
					
				String stars = ""; // 문자열 stars의 초기화  [ 빈 문자열 ("")은 문자열 연결 연산 (+)의 경우에 초기화로 사용한다. ]
				                   // null : 저장된 문자열이 없다는 의미. (일반적으로는 사용이 맞지만, ""을 사용해야하는 경우도 확인!)
				for (int n = 0 ; n < grade ; n++) {
					// grade만큼 반복문을 짜려고 한다.
					stars += "★ " ;
				}
				
				System.out.println("평점 : " + grade + " ( " + stars + " )");
				
				
				sc.close();
		
		
		
		
		
		
		
		
		
		
	}
}
