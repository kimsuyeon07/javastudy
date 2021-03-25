package ex05_list;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList 클래스
 * 1. List 인터페이스를 구현한 클래스 [generic; 제네릭 기반으로 만들어졌다.]
 * 2. 생성 방법
 *    1) ArrayList<E> list = new ArrayList<E>();
 *    2) List<E> list = new ArrayList<E>();  
 *       => *(List가 SuperClass이기 때문에 사용 가능)*
 * 3. 배열을 구현한 클래스이다.
 *    => 자동으로 길이 조정! (길이를 선언해주지 않아도 된다.)
 * 4. 장점 : 순차적인 접근이 빠르다.
 * 5. 단점 : 중간 위치에 추가/삭제가 느리다.
 * < ArrayList클래스 : 한번 만들어놓으면 추가/삭제가 거의 없는 시스템일 때 사용하는 것이 좋다. >
 */


public class ArrayListMainClass {

	public static void main(String[] args) {

		// 사용법.
		
		// 1. 생성  : 
		// import java.util.List;
		// import java.util.ArrayList;
		List<String> list = new ArrayList<String>();
		
		// 2. 추가  : .add();
		// .add(e) : 순차적으로 e라는 데이터 저장.
		// .add(index, e) : 몇번 인덱스번호 자리에 e라는 데이터를 저장하겠다.
		list.add("브레드");
		list.add("짱구");
		list.add("자두");
		list.add("둘리");
		list.add("철수");
		
		// 3. 제거  : .remove();
		// .remove(index) : 몇번 인덱스번호의 데이터 삭제
		// .remove(Object) : 지울 데이터의 값을 적는다.
		list.remove(0);
		list.remove("짱구");
		
		// 4. 크기(길이) : .size();
		System.out.println("리스트의 길이 : " + list.size());
		
		// 5. 포함 여부 확인  : List는 for문을 따로 적지 않아도 알아서 자바에서 돌린다. 
		// .contains(Object);
		if (list.contains("둘리")) {
			System.out.println("둘리가 있습니다.");
		} else {
			System.out.println("둘리가 없습니다.");
		}
		
		// 6. 요소 가져오기 : .get(index);
		System.out.println("첫 번째 요소 : " + list.get(0));
		System.out.println("마지막 요소 : " + list.get(list.size()-1));  // 마지막 인덱스번호는 항상 (길이 -1)이다.
		
		
		// 7. 전체 순회
		// 7-1) 일반 for문
//		for (int i = 0 ; i < list.size() ; i++) {
//			System.out.println((i+1) + "번째 요소 : " + list.get(i));
//		}
		// 일반 배열.
		String[] s = { "","","","",""};
		for (int i=0; i< s.length ; i++) {
			System.out.println(s[i]);
		}
		
		// 속도 비교. (성능 비교)
		// => list.size() : 메서드호출 | s.length : 참조변수
		//    메서드를 호출하는 것이 메모리값이 더 든다.
		// => list.size() → 성능을 위해서 수정하는 것이 좋다.
		// ↓
		int length = list.size(); // => size()메서드 호출을 1번만 진행하도록 변수에 저장해둔다.
		for (int i = 0 ; i < length ; i++) {
			System.out.println((i+1) + "번째 요소 : " + list.get(i));
		}
		// <변수 선언을 동시에 하는 방법> (가능)
		// for (int i = 0, int length = list.size()  ;  i < length  ;  i++) { ...  
		
		// 7-2) 향상 for문
		for (String element : list) {  // list의 타입  => String  
			System.out.println(element);
		}
		
		
		// 8. 출력
		System.out.println("한 번에 출력 : " + list); 
		
		// 9. 초기화 : .clear();
		list.clear();
		System.out.println("한 번에 출력 : " + list); 
		
		
		
		
		
		
		
		
		
	}
}
