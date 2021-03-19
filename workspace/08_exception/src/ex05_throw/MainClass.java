package ex05_throw;

public class MainClass {

	public static void main(String[] args) {

//		
//		// 예외를 직접 발생시키는 경우 : throw 이용!
//		try {
//			throw new NumberFormatException();
//		} catch (Exception e) {  //NumberFormatException@15ㄻ12 
//			System.out.println("예외가 발생했습니다. " + e);
//		}
		
		
		Claculator calculator = new Claculator();
		
		try {
			calculator.division(0);
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다. " + e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
