package ex08_static;

public class MyMath {

	// private 생성자 => MyMath 내부에서만 생성이 가능하게 하겠다.
	// 외부에서 new를 할 수 없도록 만든다.
	private MyMath() {}
	
	
	// field : 누구나 사용할 수 있는 고정된 값의 데이터
	// 원주율 (클래스 필드)
	public static final double PI = 3.141592;
	
	
	// 절대값 (클래스 메서드)
	public static double abs(double n) {
		return (n>0) ? n : -n ;
	}
	
	// 제곱 (클래스 메서드)
	public static double pow(double a , double b) {  // a의 b제곱
		double result = 1;  // 곱하기는 초기화는 "1"을 해준다.
		for (int i = 0 ; i < b ; i++) {
			result *= a;
		}
		return result;
	}
	
	
	
	// ______________________________________________________________
	
	// Math.PI  => 클래스 메서드  >>> 클래스의 이름으로 접근하는 방식 : static을 사용한다!
	// ↓
	// [ static 사용 이유 ? ]
	// Math math = new Math();를 하지 않으려고 사용한다.
	
	
	
	
	
	
	
	
	
	
	
	
}
