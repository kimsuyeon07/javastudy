package ex07_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Iterator 인터페이스
 * 1. Collection(List, Set)을 순회하는 경우에 사용합니다.
 * 2. "반복자"라고 합니다.
 * 3. 순회를 하고자 하는 collection(List, Set)에 iterator() 메서드를  부착해서 생성합니다.
 * 4. 인덱스 유무와 상관없이 사용합니다. (있는 구조, 없는 구조 모두 사용 가능) 
 */

public class IteratorMainClass {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("movie");
		set.add("music");
		set.add("sport");

		// set를 순회할 수 있는 Iterator 객체 생성  : new(X)=>인터페이스는 new가 불가능하다.
		Iterator<String> itr = set.iterator();  // 순회하고자 하는 객체에 iterator()를 붙여주는 방식
												// set를순회할 수 있는 itr 객체 생성
		
		// hasNext() : 다음 요소가 있으면 true, 없으면 false 반환
		// next()    : 다음 요소를 가져온다.
		
		// 순회
		while (itr.hasNext()) { // set에 남아 있는 요소가 있으면 반복한다.
			String str = itr.next();  // 저장된 요소를 가져와서 str에 저장
			System.out.println(str);  // 출력
		}
		
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("운동");
		list.add("뜨개질");
		list.add("요리");
		
		Iterator<String> itr2 = list.iterator();
		
		while (itr2.hasNext()) {
			String str = itr2.next();
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
