package ex05_list;

import java.util.ArrayList;
import java.util.List;

/*
 * LinkedList 클래스
 * 1. List 인터페이스를 구현한 클래스 [generic; 제네릭 기반으로 만들어졌다.]
 * 2. 생성 방법
 *    1) LinkedList<E> list = new LinkedList<E>();
 *    2) List<E> list = new LinkedList<E>();  
 *       => *(List가 SuperClass이기 때문에 사용 가능)*
 * 3. 연결리스트를 구현한 클래스이다.
 *    => 자동으로 길이 조정! (길이를 선언해주지 않아도 된다.)
 * 4. 장점 : 모든 위치의 추가/삭제가 빠르다
 * 5. 단점 : 순차적인 접근이 느리다.
 * < ArrayList클래스 : 한번 만들어놓으면 추가/삭제가 거의 없는 시스템일 때 사용하는 것이 좋다. >
 */


public class LinkedList {

	public static void main(String[] args) {

		// ArrayList와 LinkedList의 사용법은 같습니다.
		
		// 성능 비교
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new java.util.LinkedList<Integer>();
		
		// 1. 추가 : ArrayList
		long start1 = System.nanoTime();
		for (int n = 1; n <= 10000; n++) {
			list1.add(0, n);
		}
		long end1 = System.nanoTime();
		System.out.println("ArrayList 삽입 소요 시간 : " + (end1 - start1) + "ns");
		

		// 1. 추가 : LinkedList
		long start2 = System.nanoTime();
		for (int n = 1; n <= 10000; n++) {
			list2.add(0, n);
		}
		long end2 = System.nanoTime();
		System.out.println("LinkedList 삽입 소요 시간 : " + (end2 - start2) + "ns");

		
		// 2. 순회 : ArrayList
		long start3 = System.nanoTime();
		for (int i = 0 , length = list1.size() ; i<length ; i++) {
			list1.get(i);
		}
		long end3 = System.nanoTime();
		System.out.println("ArrayList 순회시간 : " + (end3 - start3) + "ns");
		
		
		// 2. 순회 : LinkedList
		long start4 = System.nanoTime();
		for (int i = 0 , length = list2.size() ; i<length ; i++) {
			list2.get(i);
		}
		long end4 = System.nanoTime();
		System.out.println("LinkedList 순회시간 : " + (end4 - start4) + "ns");
		

		
		
		
		
		
	}
}
