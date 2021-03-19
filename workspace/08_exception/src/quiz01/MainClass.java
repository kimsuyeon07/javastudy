package quiz01;

public class MainClass {

	public static void main(String[] args) {

		
		// 계산기를 만들고,
		// 4가지 연산을 모두 수행하고,
		// 발생 할 수 있는 예외를 예상해서 처리해 봅시다.
		
		Claculator claculator = new Claculator();
		
		
		
		
		try {
		
			claculator.addition(10);
			claculator.subtraction(5);
			claculator.multiplication(2);
			claculator.division(0);
			
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		
		// JAVA의 연산 특징
		// : 10 / 0 : Exception
		// : 10.0 / 0.0 infi
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
