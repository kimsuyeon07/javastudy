package ex06_set;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet 클래스
 * 1. Set 인터페이스를 구현한 클래스
 * 2. 기본 특징
 *    1) 인덱스가 없습니다. (순서가 없다.)
 *    2) 중복 저장 불가능 <동일한 데이터가 저장되지 않는다.>
 * 3. 기본적인 사용법은 List와 같지만, 인덱스가 없음에 주의합니다.
 */

public class HashSetMainClass {

	public static void main(String[] args) {

		// HashSet 객체 생성
		Set<String> set = new HashSet<String>();
		
		// 추가. 중복저장 해보기
		set.add("java");
		set.add("java");
		set.add("jsp");
		set.add("jsp");
		set.add("spring");
		set.add("spring");

		// 요소 개수 확인
		System.out.println("요소 개수 : " + set.size());
		
		// 출력 : 순서가 없다.
		for (String s : set) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
