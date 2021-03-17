package ex01_variable;

public class Ex03_primitive_type {

	public static void main(String[] args) { 

		// [ 정수 타입 ]
		
		// 1. byte
		//    크기 : 바이트, 단독 사용은 아니고 배열로 사용
		System.out.println(Byte.MAX_VALUE);  // 127
		System.out.println(Byte.MIN_VALUE);  // -128
		System.out.println(Byte.SIZE);       // 8(단위 : 비트) = 1바이트

		// 비트에 의한 값의 범위
		// 8비트 : -2의 7제곱 ~ 2의 7제곱 -1 까지
		// n비트 : -2의 (n-1)제곱 ~ 2의 (n-1)제곱 -1 까지
		 
		// 2. short 타입
		//    학습할 필요가 없음.
		 
		// 3. int
		//    크기 : 4바이트, 일반적인 기본 정수 자료형
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.SIZE);      // 32(32비트)
		 
		//4. long
		//   크기 : 8바이트, int보다 큰 정수 자료형
		System.out.println(Long.MAX_VALUE);   // 9223372036854775807
		System.out.println(Long.MIN_VALUE);   // -9223372036854775808
		System.out.println(Long.SIZE);        //64비트
		
		
		
		// [ 실수 타입 ]
		
		// 1. float
		//    크기 : 4바이트, 과거 호환용
		
		// 2. double
		//    크기 : 8바이트, 일반적인 실수 자료형
		System.out.println(Double.MAX_VALUE);      // 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);      // 4.9E-324
		System.out.println(Double.MAX_EXPONENT);   // 1023
		System.out.println(Double.MIN_EXPONENT);   //-1022
		System.out.println(Double.SIZE);           // 64비트
		
		// 부호, 소수부, 지수부   (실수와 정수는 구조가 다르게 표현된다.)
		// -> 1.7976931348623157E308 : 1.(부호) 7976931348623157(소수부) E308(지수부)
		// 항상 소수 자리수는 부정확할 수 있다. (BigDecimal 클래스를 이용해서 정확히 표현할 수 있다.)
		

		
		// [ 문자 타입 ]
		// 1. char
		//    크기 : 2바이트, 유니코드 기반 (국제 표준 코드)
		System.out.println(Character.SIZE);  // 16비트
		
		
		
		// [ 논리 타입 ]
		// 1. boolean
		//    크기 : 이론상으로는 1비트(참, 거짓 만 표현하면 되므로)
		//    true, false
		
		
     	//------------------------------------------------------------
		
		
		// 변수 선언
		int a = 10;
		long b = 1234567890;
		long bb = 12345678909L;
		char c = 'a';
		float f = 1.5f;
		double d = 1.5;
		boolean e = true;
		
		// primitive type은 변수에 데이터가 그대로 저장된다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(bb);
		System.out.println(f);
		System.out.println(d);
		System.out.println(e);
		
		
		

		
		
		
		
		
		
		
	}
}
