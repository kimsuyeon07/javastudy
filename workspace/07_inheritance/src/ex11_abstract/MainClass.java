package ex11_abstract;

public class MainClass {

	public static void main(String[] args) {

		Staff staff = new SalaryMan("alice", 300);
		staff.info();
		
		// staff의 getPay()는 어떻게 호출할 수 있나요?
		// staff.getPay(); -> ERR
		// 1. Staff클래스에 getPay() 추가한다. 
		//		: 모든 직원이 getPay()를 가지고 있는가? 
		//		  -> 맞다면 "1"번 방법이 좋다.
		//		  -> 부모클래스안의 메서드에는 정보가 없지만 
		//		   	   대부분의 자식클래스 메서드안의 정보를 호출하는 경우는 [ abstract 키워드 사용. ]
		// 2. SalaryMan클래스로 캐스팅한다.
		// 		: ((SalaryMan)staff).getPay();
		
		System.out.println(staff.getPay());
		
		
		
		
		
		
		
		
		
		
		
	}
}
