package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
 
		// 문제1. ) 임의의 양수 1개 입력 받아서 "홀수", "짝수", "3의 배수" 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 임의의 양수 1개 입력 
		System.out.print("양수 입력 : ");
		int n = sc.nextInt();
		
		
		// if문  : "홀수", "짝수", "3의 배수"
		if (n % 3 == 0) {
			System.out.println(n + " : 3의 배수");
		} else if (n % 2 == 0) {
			System.out.println(n + " : 짝수");
		} else 
			{System.out.println(n + " : 홀수");
		}
		
		
		sc.close();
	}
}
