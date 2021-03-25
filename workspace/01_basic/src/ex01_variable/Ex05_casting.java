package ex01_variable;

public class Ex05_casting {

	public static void main(String[] args) {
 
		// casting : 다른 타입(자료형)으로 변환하는 것
		
		// 자동 형 변환 (promotion) : 변환 되었을 때, 데이터 값이 회손되지 않을 경우에만 적용됨.        
		System.out.println(1 + 1.5 );  // 1 + 1.5 -> promotion으로 1.0 + 1.5 변환 뒤 계산된다.
		                               // 정수 + 실수 의 계산법일 때 알아서 실수형으로 변환된 후 계산된다.
		// 강제 형 변환 (casting)
		int a = 1;
		double b = 1.5;
		System.out.println(a + (int)b);  // b를 잠시 int형으로 변환시킨다. <강제로> 데이터값이 회손되어도  )
		
		
	}
}
