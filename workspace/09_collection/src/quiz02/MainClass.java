package quiz02;

import java.util.ArrayList;
import java.util.List;

// 1 ~ 10000 사이의 값을 가지고 있는 ArrayList를 2개 만들고,
// 모든 요소를 하나씩 삭제합니다.
// 1. 가장 성능이 나쁜 방법
// 2. 가장 성능이 좋은 방법

public class MainClass {

	public static void main(String[] args) {
 
		// ArrayList : 성능이 나쁜 방법 : 인덱스번호 0부터 삭제하고 나머지 데이터값을 앞으로 당겨오는 방법.
		
		// 생성
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		
		// 추가
		for (int i = 0 ; i < 10000 ; i++) {
			list1.add(i + 1);
			list2.add(i + 1);
		}

		// 시작 시간.
		long start1 = System.nanoTime();
		// 제거
		for (int i = 0, length = list1.size() ; i<length ; i++) {
			list1.remove(0);  // 인덱스0번을 지우고, 다음데이터를 밀어오고, => 반복적으로 지운다.
		}
		// 끝나는 시간.
		long end1 = System.nanoTime();
		// 시간 출력
		System.out.println("list1의 작동 시간 : " + (end1 - start1) + "ns");
		
			
		
		/////
		
		
		// 시작 시간.
		long start2 = System.nanoTime();
		// 제거
		for (int i = list2.size()-1 ; i > -1 ; i--) {
			list2.remove(i);  // 인덱스번호 : 마지막 인덱스번호를 출력해야 하기 때문에
		}
		// 끝나는 시간.
		long end2 = System.nanoTime();
		
		// 시간 출력
		System.out.println("list2의 작동 시간 : " + (end2 - start2) + "ns");
			

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
