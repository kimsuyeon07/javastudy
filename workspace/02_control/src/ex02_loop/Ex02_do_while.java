package ex02_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
 
		// do-while문
		// 1. while문입니다. 
		// 2. 반드시, 한 번은 실행하는 while문
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n = 0; // 입력받는 변수.
		
		// ** while문과 다르게 n = -1 초기화값이어도 우선 do-while문이 실행된다. **
		// do : just do it! 의 으미라고 보면 된다.
		do {
			System.out.print("양수만 입력 : ");
			n = sc.nextInt();
			total += n;
		} while (n >= 0);
		
		// 마지막의 음수를 더한 값은 빼주어야 한다.
		total -= n;
		
		System.out.println("입력받은 양수의 총 합 : " + total);
		
		sc.close();
		
		
	}
}
