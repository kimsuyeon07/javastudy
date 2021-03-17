package quiz12;

public class Seat {
	
	// field
	private String name;  // 예매자

	
	// constructor
	

	// 비어있는 자리도 만들수 있다.
	
	// method : 필수
	// 1. 예매자 이름 확인
	public String getName() {
		return name;
	}
	// 2. 예매 (예매자 이름 저장)
	public void setName(String name) {
		this.name = name;
	}
	// 3. 예매 취소
	public void cancel() {
		this.name = null;
	}
	// 4. 예매 여부 확인
	//	   1) 예매가 된   좌석 : false (예매 불가능 의미)
	//	   2) 예매가 안된 좌석 :  true (예매 가능 의미)
	public boolean check() {
		return ( name == null ) ;
	}
	// 5. 좌석 확인
	public void info() {
		if (name == null) {
			System.out.print("가능");
		} else {
			System.out.print(name.charAt(0) + "*" + (name.length() > 2  ?  name.charAt(name.length() -1)  :  "" ));  // 삼항연산자 사용
			// -> name의 길이가 2보다 클 때, name의 마지막글자를 보여주겠다.
			// 이름이 3글자면 김*연  ,  2글자면 김*,  4글자면 abcd -> a*d
		}
	}
	
	
	// method :  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
