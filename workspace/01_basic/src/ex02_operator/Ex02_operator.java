package ex02_operator;

public class Ex02_operator {

	public static void main(String[] args) {
 
		// 4. 관계 연산자 : >, >=, <, <=, ==, !=
		// 결과의 타입은 boolean
		
		int age = 20;
		boolean isAdult = age >= 20;
		// 관계 연산자는 boolean타입으로 만들어준다!
		
		System.out.println(isAdult);
		
		
		// 5. 논리 연산자 : &&, ||, !
		// 대부분 관계연산자와 함깨 사용.
		// 1) && : 모든 관계 연산의 결과가 true이면 true, false이면 false.
		// 2) || : 관계 연산의 결과가 하나라도 true이면 true, 아니면 false.
		// 3) !  : 관계 연산의 결과를 반대로 변경.
		
		int a = 10;
		int b = 10;
		System.out.println(a == 10 && b == 10);
		System.out.println(a == 10 || b == 0);
		System.out.println(!(a == 10));
		
		
		System.out.println(a == 0 && ++b >= 0);  // &&연산은 false가 나오면 연산을 멈춤. (앞에서 false가 나와서, ++b >= 0 은 동작하지 않았음.)
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == 10 || ++b > 0);   // ||연산은 (처음조건에서)true가 나오면 연산을 멈춤.
		System.out.println(a);
		System.out.println(b);
		
		
		
	}
}
