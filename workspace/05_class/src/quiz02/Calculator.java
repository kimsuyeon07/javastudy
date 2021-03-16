package quiz02;

public class Calculator {

	
	// method
	// 1. 결과타입 : (void) 결과값이 없다.
	// 2. 메서드명 : addtion
	// 3. 매개변수 : 전달되는 2개의 int값이 있다.
	// 4. 역할     : 전달된 인수의 합계 결과를 아래와 같은 형식으로 보여주어라.
	//    1 + 2 = 3;
	void addtion(int a, int b) {
		System.out.println(a + " + "+ b +" = " + (a + b) );
	}
	
	// method
	// 1. 결과타입 : (int) 결과값의 타입 int
	// 2. 메서드명 : subtraction
	// 3. 매개변수 : 전달되는 2개의 int값이 있다.
	// 4. 역할     : 전달된 인수의 뺼셈 결과를 반환한다. 
	//               다만, 항상 큰수에서 작은수를 뺀다 
	int subtraction(int a, int b) {
		return ( a>=b ? (a - b) : (b - a) );
	}
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
}
