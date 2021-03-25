package ex02_string;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
 
		// 2. 정수 / 실수 판별하기
		// 입력 : 120
		// 120은 정수입니다.
		// 입력 : 3.14
		// 3.14는 실수입니다.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("입력 : ");
		String input = sc.next();
		// 입력값을 문자열로 받는 이유 : 구분 방법이 "."이기 때문에
		// 정수, 실수 구분 방법 ( "." 의 유무)
		if (input.indexOf(".") == -1) {
			System.out.println("정수입니다.");
		} else {
			System.out.println("실수입니다.");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
