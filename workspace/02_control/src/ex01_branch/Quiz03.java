package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
 
		// 문제3. ) switch문으로, 나이 입력 받아서 "성인", "미성년자"
		
		Scanner sc = new Scanner(System.in);
		
		//  나이 입력
		System.out.print("나이 : ");
		int age = sc.nextInt();

		
		// 조건문
		System.out.println( (age>=20) ? "성인" : "미성년자" );
		
		
		// switch문
		
//		// 1)
//		// 확인 할 수 있는 정수 데이터를 만들어주고 switch를 만들어 주면 된다.
//		int state = 0 ;
//		if (age <= 20) {
//			state = 1;
//		}
//		
//		switch (state) {
//		case 0 :
//			System.out.println("미성년자");
//			break;
//		case 1:
//			System.out.println("성인");
//			break;
//		}
//		
		// 2)
		switch ( age / 10 ) {
		case 0:  // age = 1 ~ 9 (출력 값이 같다면  마지막 case부분에만 적어주면 된다.)
		case 1:  // age = 10 ~ 19
			System.out.println("미성년자");
			break;
		default:  // age >= 20
			System.out.println("성인");
		}
		
		
		sc.close();
		
		
		
	}
}
