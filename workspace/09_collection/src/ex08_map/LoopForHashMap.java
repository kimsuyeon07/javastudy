package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopForHashMap {

	public static void main(String[] args) {

		
		Map<String, String> me = new HashMap<String, String>();
		
		me.put("name", "김수연");
		me.put("age", 26+"");
		me.put("phone", "010-8572-4951");
		
		// 1. 향상 for문은 Map에서 Key를 뺍니다.
		// me에서 Key만 빼오는 메서드 : keySet();
		Set<String> keys = me.keySet();
		for (String key : keys) {  // key를 알아야 value를 뺄 수 있기 때문에 진행.
			System.out.println(key + " : " + me.get(key));
		}
		
		
		
		// 2. Iterator 인터페이스 : 반복할 대상 

		Iterator<String> itr = keys.iterator(); // 일회용. 다른 코드에서도 사용하고자 하면 다시 만들어야 한다.
		while (itr.hasNext() ) {
			String key = itr.next();
			String value = me.get(key);
			System.out.println(key + " : " + value);
		}
		
		// 3. 데이터 쌍(pair)으로 뺄 수 있습니다.
		// entry : key와 value를 묶어서 entry리고 합니다.
		// key : getKey()
		// value : getValue()
		Set <Map.Entry<String, String>> entrys =  me.entrySet();

		// 1) for
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		// 2) Iterator
		Iterator<Map.Entry<String, String>> itr2 = entrys.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, String> entry = itr2.next();
			System.out.println(entry);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
