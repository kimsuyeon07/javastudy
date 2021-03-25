package ex03_input;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
 
		// 문제 1. int타입의 점수를 3개 입력 받아서 평균 구하기
		Scanner sc = new Scanner(System.in);
		
		// int타입의 점수를 3개 입력
		System.out.println("1) 정수를 입력하세요.");
		int n1 = sc.nextInt();
		System.out.println("2) 정수를 입력하세요.");
		int n2 = sc.nextInt();
		System.out.println("3) 정수를 입력하세요.");
		int n3 = sc.nextInt();
		
		// 평균 구하기
		double ave = (n1 + n2 + n3) / 3.0;
		
		// 출력
		System.out.println("입력받은 3개의 정수의 평균 : " + ave);
		
		
		sc.close();
		
		
	}
}
