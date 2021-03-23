package ex08_map;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap 클래스
 * 1. Map 인터페이스를 구현한 클래스 (다른 collection과 다른 사용법)
 * 2. 데이터를 쌍(pair)으로 저장하는 클래스
 * 3. 키(key)-값(value)의 쌍으로 저장됩니다.
 *    1) 키(key)   : 중복이 불가능합니다.
 *    2) 값(value) : 중복이 가능합니다.
 * 4. 인덱스의 역할을 키(key)가 수행합니다.
 * __
 *-> 키(key) : 일반적으로 <String>으로 지정
 *-> 값(value) : 
 */

public class HashMapMainClass {

	public static void main(String[] args) {

		Map<String, Integer> sungjuk = new HashMap<String, Integer>();
		
		// 1. Map의 추가 : .put(key, value);
		sungjuk.put("지구력", 80);
		sungjuk.put("근력", 70);
		sungjuk.put("인내력", 90);
		
		sungjuk.put("지구력", 100); // 기존 지구력을 덮어씁니다. (오류는 나지 않는다.)
		
		
		// 2. Map의 제거 : .remove(key);
		sungjuk.remove("근력");  // "근력"이 속해있는 데이터값을 지우겠다.
		
		// 3. Map의 요소 가져오기 : .get(key);
		System.out.println("지구력 : " + sungjuk.get("지구력"));
		System.out.println("인내력 : " + sungjuk.get("인내력"));
		
		// 4. Map의 크기 : .size();
		System.out.println("저장된 데이터의 개수 : " + sungjuk.size());
		
		// 5. Map의 조회 _출력
		System.out.println(sungjuk); // { ... } 형태로 출력
		
		// 6. 순회는 방법이 많아서 따로 진행.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
