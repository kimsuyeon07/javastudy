package ex01_branch;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
 
		//  문제2. ) 나이를 입력받아서 구분 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 나이를 입력
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		//  나이 범위(1~100)을 벗어나면 : "불가능한 나이" (먼저)
		
		
		if (age < 1 || age > 100) {
			System.out.println("불가능한 나이"); 
		} else if (age <= 7) {
			System.out.println("미취학아동");
		} else if (age <= 13) {
			System.out.println("초등학생");
		}else if (age <= 16) {
			System.out.println("중학생");
		} else if (age <= 19) {
			System.out.println("고등학생");
		} else {System.out.println("성인");}
		
		
		
//		// 출력
//		switch (age) {
//		case age <= 7 :
//			
//		}
		
		
		
		sc.close();
		
		
	}
}
