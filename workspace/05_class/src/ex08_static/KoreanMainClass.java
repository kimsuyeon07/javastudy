package ex08_static;

public class KoreanMainClass {

	public static void main(String[] args) {

		
		// 인스턴스 korean1
		Korean korean1 = new Korean();
		
		// 인스턴스 필드에 접근합니다. : 인스턴스 korean1을 통해 접근.
		korean1.name = "홍길동";
		
		// 클래스 필드에 접근합니다.  : 방법 2가지
		System.out.println(korean1.COUNTRY);  // 1) 인스턴스로 접근 (추천하지 않습니다.)
		System.out.println(Korean.COUNTRY);   // 2) 클래스 '이름'으로 접근.
		
		
		
		
		
		
		
	}
}
