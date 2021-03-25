package ex05_throw;

public class Claculator {

	// field
	private int result;
	
	// constructor
	
	// method : plus
	public void addition(int a) {
		result += a;
		System.out.println("현재 저장된 값 : " +  result);
	}
	public void subtraction(int a) {
		result -= a;
		System.out.println("현재 저장된 값 : " +  result);
	}
	public void multiplication(int a) {
		result *= a;
		System.out.println("현재 저장된 값 : " +  result);
	}
	public void division(int a) throws ArithmeticException {  // 2. division 메서드가 어떤 예외를 던지는지 명시합니다.
		// ↑
		// throws ==> 던지는 예외를 추가할 수 있다. 
		// throws ArithmeticException, NumberFormatException, ... (가능)
		
		if(a == 0) {
			throw new ArithmeticException();  // 1. 예외를 직접 던집니다.
		}
		
		result /= a;
		System.out.println("현재 저장된 값 : " +  result);
	}
	
	
	
	
	
	
	
	
	
	
}
