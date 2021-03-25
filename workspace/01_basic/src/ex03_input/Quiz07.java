package ex03_input;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
 
		// 체질량지수 구해서 건강상태 출력
		Scanner sc = new Scanner(System.in);
		
		// double 타입의 몸무게와 키를 입력
		System.out.println("몸무게를 입력하세요.");
		double weight = sc.nextDouble();
		
		System.out.println("키를 입력하세요.");
		double height = sc.nextDouble();
		
		height /= 100;  // 185.5cm -> 1.855m  변경
		
		// 체질량지수 = 몸무게 / 키(단위 : m)의 제곱
		double bmi = weight / (height * height) ;  // Math.pow(height, 2); 로도 가능!
		
		// 건강상태 조건식
		String healthCondition = (bmi >= 25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중" ;
		
		// 출력
		System.out.println("체질량 지수 : " + bmi + "( " + healthCondition + " )");
//		System.out.println(n >= 25 ? "과체중" :  (n < 19) ? "정상" : "저체중");
		
		
		
		
		
		
		
		
	}
}
