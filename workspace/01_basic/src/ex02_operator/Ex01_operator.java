package ex02_operator;

public class Ex01_operator {

	public static void main(String[] args) {
 
		// 1. 산술연산자 : + ,- , *, /, %
		System.out.println(7 + 2);
		System.out.println(7 - 2);
		System.out.println(7 * 2);
		System.out.println(7 / 2); // 값 : 3 (몫)
		System.out.println(7 % 2); // 값 : 1 (나머지)
		
		System.out.println(7.0 / 2.0); // 값 : 3.5 (나누기 연산)
		
		
		// 2. 증감연산자 : ++, --
		int a = 10;
		System.out.println(++a);  // 값 : 11 (a를 먼저 증가시키고 출력)
		System.out.println(a++);  // 값 : 11 (a를 먼저 출력시키고 증가시킴)
		System.out.println(a);
		
		int b = 10;
		System.out.println(--b);  // 값 : 9 (b를 먼저 감소시키고 출력)
		System.out.println(b--);  // 값 : 9 (b를 먼저 출력시키고 감소)
		System.out.println(a + b);  // a=12, b=8  12 + 8 = 20

		
		// 3. 대입연산자 : =, +=, -+, *=, /=, %=
		// 문제) x와 y의 값을 교환.
		int x = 1;
		int y = 2;
		
	    int temp = x; // x를 temp에 백업해 둔다.
	    x = y;     // x는 y가 되었음.
	    y = temp;  // y는 백업해 둔 x가 되었음.
	    
	    System.out.println(x);
	    System.out.println(y);
		
		
	    // a += 1   ->   a = a + 1
		// a -= 1   ->   a = a - 1
	    // a *= 1   ->   a = a * 1
	    // a /= 1   ->   a = a / 1
	    // a %= 1   ->   a = a % 1
	    
	    // 문제. money를 5% 증가시켜라
	    int money = 100;
//	    money = money + (int)(money * 0.05);  // 정수와 실수의 덧셈은 오류! -> 실수를 정수로 변환시켜줘야한다.
	    money += (int)(money * 0.05);
	    System.out.println(money);


	    
//	    money *= 1.05;   도 가능.
		
		
		
		
	}
}
