package ex07_recursive;

public class Calculator {

	
	
	
	// 역할 : n! 값을 반환한다. (팩토리얼 구하기)
	// 3! (3팩토리얼) == 1 * 2 * 3 
	public int getFactorial(int n) {
		
		if (n == 1) {
			return 1;
			// n의 값이 1일 때 1을 호출해라. { getFactorial(1) == 1; 의미 }
		} else {
			return n * getFactorial(n-1);
		}
		// n = 3 일때,
		// 3 * getFactorial(2) 
		//          : 2 * getFactorial(1) 
		//                       : 1
		// 3 *        2 *          1
		// 값 : 6
	}
		 
	
	
	
	
	
	
	
	
	
}
