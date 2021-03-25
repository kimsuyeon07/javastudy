package ex02_string;

// String의  +연산자를 많이 사용하면 성능이 떨어진다. (메모리를 많이 사용하는 방식이라서)
// 성능 때문에
// StringBuilder로 문자열을 생성한 뒤
// String으로 변환하여 사용하는 경우가 많다.

public class Ex02_StringBuilder {

	public static void main(String[] args) {

		// java.lang.StringBuilder
		
		// 문자열 생성
		StringBuilder sb = new StringBuilder("hello");
		
		// 문자열 추가 (핵심 메소드)
		sb.append(". ").append("java");  // 계속해서 연결 사용가능. .append().append()...;
		
		System.out.println(sb);
		
		// 문자열 비교
		// str1, str2 : String이 아니라서 비교할 수 없음.
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		System.out.println(sb1.equals(sb2));  // false (비교할 수 없음.)
		
		// 문자열로 변환해 봅시다.
//		String str1 = "" + sb1;
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));  // true (이제 비교가 가능)
		
		
		
		
		
		
		
		
	}
}
