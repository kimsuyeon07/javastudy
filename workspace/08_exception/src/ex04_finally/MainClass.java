package ex04_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		try {
			System.out.println("정수를 입력하세요 >>>");
			a = sc.nextInt();
			System.out.println("입력은 " + a + "입니다.");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		} finally {  // "무조건" 실행하는 영역 : finally
			System.out.println("프로그램을 종료합니다.");
			sc.close();  // => 사용 이유 : 예외 처리 시, 오류가 발생하든 안하든 스캐너를 종료하겠다고 선언.
		}
		
		
		
		// finally : 
		// 1. try문에 "finally"는 단 한번 사용할 수 있다.
		// 2. 무조건 실행하는 영역이다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
