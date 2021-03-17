package ex03_input;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
 
		
		// 나이를 입력받아서 "성인", "미성년자" 구분 출력 
		Scanner sc = new Scanner(System.in);
		
		// 나이를 입력
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		// 조건문 생성
		boolean bAge = age >= 20;
		
		// "성인", "미성년자" 구분 출력
		System.out.println(bAge ? "성인" : "미성년자");
		
		
		sc.close();
		
		
	}
}
