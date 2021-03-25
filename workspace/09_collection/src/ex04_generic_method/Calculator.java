package ex04_generic_method;

public class Calculator {

	// method
	public <T> double getTotal1(T[] a) {  // 배열을 전달하고자 한다. 
		double total = 0;  // 
		for (int i =0 ; i < a.length ; i++) {
			total += ((Number)a[i]).doubleValue();  // 타입의 변환이 필요해서 . : Integer의 부모클래스 Number로 캐스팅. 
													// [ .doubleValue() ] 소수점을 가질 수 있는 값으로 변환
		}
		return total;
	}
	
	public <T extends Number> double getTotal2(T[] a) {
		// T는 Number를 상속받는 클래스만 가능하다.
		
		double total = 0;  // 
		for (int i =0 ; i < a.length ; i++) {
			total += a[i].doubleValue(); 
		}
		return total;
		
	}
	
	
	
	
	
	
	
	
	
}
