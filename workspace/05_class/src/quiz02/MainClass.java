package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calc;         //객체는 없고, 참조 변수만 있는 상태
		calc = new Calculator(); // 객체가 만들어지고, 그 참조 값이 calc에 전달
		                         // 객체가 만들어지는 시점을 "인스턴스화"되었다고 한다.
		

		calc.addtion(1, 2);  // addtion 메서드에 출력코드가 입력되어 있어서 메서드만 만들어주면 출력까지 완성.
		
		// 뺄셈 메서드 출력 (int 타입 메서드 경우. : return)
		calc.subtraction(5, 2);
		
		int a = 5;
		int b = 10;
		if(a >= b) {
			System.out.println(a + " - " + b + " = " + calc.subtraction(a, b));
		} else {
			System.out.println(b + " - " + a + " = " + calc.subtraction(a, b));
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
