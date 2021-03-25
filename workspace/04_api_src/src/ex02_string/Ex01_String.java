package ex02_string;

public class Ex01_String {

	public static void main(String[] args) {
							 
		// 1. 동일한 문자열 리터럴은 자바에 의해서 최적화 되기 때문에 
		//    "apple"이라는 리터럴이 하나만 생긴다.
		String a = "apple";  // a는 "apple"이라는 데이터의 주소값을 가지고 있는 것.
		String b = "apple";  // b 또한 "apple"이라는 데이터의 주소값을 가지고 있는 것.
		System.out.println(a == b);  // a와 b의 주소값이 같은가? 'true'!
		
		// 2. "new" 는 무조건! 새로 만들어진다.
		//    "banana"는 2개가 만들어진다.
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c == d);  // c와 d의 주소값이 같은가? 'false'!
		
		// 3. 문자열의 길이는 " length()메소드 "로 구한다.
		//    배열과 비슷하지만 구분 확실하게!
		System.out.println(a.length());  // 5 (글자 수 의미 : 한글, 영문, 숫자  등 모두)
		
		// 4. 문자열의 일부를 추출하는 경우에는 
		//    " substring()메소드 " 사용한다.
		//    1) substring(시작인덱스) : 시작인덱스부터 끝까지 추출한다.
		//    2) substring(시작인덱스, 종료인덱스) : 시작인덱스 <= 추출문자열 < 종료인덱스  (이상 - 미만 까지)
		System.out.println(a.substring(0, 3));  // a(0) p(1) p(2) l(3) e(4)
 
		// 5. 문자열 양 옆의 공백문자(while space)를 제거하려면 
		//    " trim()메소드 " 사용한다.
		String name = "     alice   " ;
		System.out.println(name + name.length());
		System.out.println(name.trim() + " " + name.trim().length());
		
		// 6. 특정 문자를 찾는 경우에 
		//    " indexOf()메소드 " 사용한다.
		String str = "best of best of best";
		System.out.println("첫 번째 best의 인덱스 : " + str.indexOf("best"));    // 처음부터 "best"를 검색한다.
		System.out.println("두 번째 best의 인덱스 : " + str.indexOf("best", 4)); // 인덱스4번부터 "best"를 검색한다.
		System.out.println("두 번째 best의 인덱스 : " + str.indexOf("best", str.indexOf("best") + 1));
		System.out.println("찾는 문자(열)이 없으면 " + str.indexOf("v"));  // 값 : -1 (없으면, -1 출력)															 // 시작인덱스번호 : indexOf("best") + 1 로 작성해 준 것 
		
		// 7. 뒤에서부터 검색하는 lastIndexOf()메서드
		System.out.println("마지막 best의 인덱스 : " + str.lastIndexOf("best"));
		
		// 8. 기존 문자를 새로운 문자로 변경 : replace()메서드 
		System.out.println(str.replace("b", "B"));
		System.out.println(str.replace("f", ""));  // "f"를 지우겠다.
		
		
		
		
		

	}
}
