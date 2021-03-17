package ex03_input;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. int타입의 점수를 3개 입력 받아서 평균 구하기
		System.out.print("숫자 1 : ");
		int a = sc.nextInt();
		System.out.print("숫자 2 : ");
		int b = sc.nextInt();
		System.out.print("숫자 3 : ");
		int c = sc.nextInt();
		// 평균값 구하기
		double grand = (a + b + c) /3.0;
		
		System.out.println("정수의 평균 : " + grand);
		
		
		// 2. double 타입의 실수 2개 입력 받아서 값을 교환하기
		System.out.println("실수 1 : ");
		double a2 = sc.nextDouble();
		System.out.println("실수 2 : ");
		double b2 = sc.nextDouble();
		
		double temp = a2;
		a2 = b2;
		b2 = temp;
		
		System.out.println("a2 : " + a2 + ", b2 : " + b2);
		
		
		
		// 3. 나이를 입력받아서 "성인", "미성년자" 구분 출력 
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		boolean bAge = age >= 20;
		
		System.out.println(bAge ? "성인" : "미성년자");
		
		
		
		// 4. int 타입의 매출액 + 등급("VIP", "일반") 입력받아서 실매출액 출력
		System.out.println("매출액 : ");
		int money = sc.nextInt();
		
		System.out.println("등급 : ");
		String revel = sc.next();
		
		double disCountRate = revel.equalsIgnoreCase("vip") ? 0.2 : 0.05;
		
		money -= (money * disCountRate);
		
		System.out.println("실 매출액 : " + money );
		
		
		// 5. 성별을 의미하는 숫자(1~4)를 입력 받아서 "남", "여" 구분 출력
		System.out.println("숫자 입력 (1~4) : ");
		int gender = sc.nextInt();
		
		if(gender % 2 == 0) {
			System.out.println("여");
		} else {System.out.println("남");}
		
		
		
		// 6. 주민번호(하이픈 없이) 전체 입력 받아서 "남", "여" 구분 출력
		System.out.println("주민번호 전체 입력(하이폰 없이) : ");
		String id = sc.next();
		char idChar = id.charAt(6);
		
		if(idChar % 2 == 0) {
			System.out.println("여자");
		} else {System.out.println("남자");}
		
		
		
		// 7. 체질량지수 구해서 건강상태 출력
		System.out.println("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.println("키 : ");
		double height = sc.nextDouble();
		
		height /= 100;
		
		double bmi = weight / (height * height) ;
		
		
		
		
		
		
		
		
		
		
		
	}
}
