package ex01_variable;

public class Ex01_literal {
	
	public static void main(String[] args) { 
		
		// 1. 정수 표현법 : 그냥 입력
		System.out.println(Integer.MAX_VALUE);  // int로 표현 할 수 있는 숫자의 최대값 : 2147483647
		System.out.println(Integer.MIN_VALUE);  // int로 표현 할 수 있는 숫자의 최소값 : -2147483648
		System.out.println(2147483647);         // 그냥 숫자로만 작성 시, < int 타입 > 의 숫자로 출력하겠다는 의미
		System.out.println(2147483648L);        // int 범위를 벗어나면 접미사 L을 붙입니다.  
		                                        // L : < long 타입 > 의 정수로 저장하겠다는 의미

		
		// 2. 실수 표현법 : 그냥 입력
		System.out.println(Double.MAX_VALUE);  // 그냥 실수 작성 시, < Double 타입 > 의 실수로 출력하겠다는 의미
		System.out.println(Double.MIN_VALUE);
		// 1.7976931348623157E308 : 1.7976931348623157 곱하기 10의 308제곱
		// 4.9E-324 : 4.9 곱하기 10의 -324제곱
		

		
		// 3. 문자 표현법 : 작은 따옴표 (')로 묶눈다.
		System.out.println('A');
		System.out.println('한');


		
		// 4. 문자욜 표현법 : 큰 따옴표(")로 묶는다.
		System.out.println("안녕하세요");
		

		
		// 5. 논리 표현법 : true 또는 false
		System.out.println(true);
		System.out.println(false);
		
		
	}
}
