package ex02_try_catch;

/*
     	try {
     		코드 작성
     		예외 발생 가능 구역
     	} catch (예외 처리 매개 변수) {
     		예외 처리 구역
     	}
 */

public class MainClass {

	public static void main(String[] args) {
 
		
		int a = 0;
		
		try {
//			System.out.println(2/ 0);  // 예외처리 중_ 예외 발생 시에 try문이 곧바로 종료. ( : a = 10; 까지 가지 못하고 종료.)
			Integer.parseInt("1.5");
			a = 10;
		} catch (ArithmeticException e) {  // 예외처리의 변수는 "e" (통일)
			System.out.println("Exception1 : 예외가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("Exception2 : 예외가 발생했습니다.");
		}  // catch블럭이 여러가지일 때는 순서대로 거쳐서 알맞는 예외처리가 나올때까지 거쳐간다.
		
		System.out.println(a);
		
		
		try {
//			String name = null;
//			name.equals("james");
			// -
			int [] b = new int[3];
			b[4] = 10;
		} catch (Exception e) {
			// Exception은 모든 예외클래스들의 "슈퍼클래스"이다.
			System.out.println("에외가 발생했습니다.");
		}

		
		
		
		
		
		
		
		
		
		
		
	}
}
