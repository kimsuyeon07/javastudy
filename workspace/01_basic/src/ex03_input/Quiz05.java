package ex03_input;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		// 성별을 의미하는 숫자(1~4)를 입력 받아서 "남", "여" 구분 출력
		Scanner sc = new Scanner(System.in);
		
		// 성별을 의미하는 숫자(1~4)를 입력
		System.out.println("성별을 의미하는  1 ~ 4 까지의 숫자 중 한개를 입력하세요. ");
		int iGender = sc.nextInt();
		
		// "남", "여" 구분하는 조건식
		boolean gender = iGender == 1 || iGender == 3 ;
		boolean gender2 = iGender%2 != 0;  //와 같은 의미 :  iGender % 2 == 1;
		String check = gender2 ? "남" : "여" ;
		
		// 출력
		System.out.println(iGender + "을 의미하는 성별 : " + check);
	
	
		sc.close();
		
	}
}
